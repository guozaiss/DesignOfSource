package com.example.guozaiss.designofsource;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import com.example.guozaiss.designofsource.cache.ImageCache;
import com.example.guozaiss.designofsource.cache.MemoryCache;
import com.example.guozaiss.designofsource.strategy.LoadPolicy;

import java.io.IOException;
import java.io.ObjectStreamException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by guozaiss on 16/1/19.
 */
public class ImageLoader {
    //单例实例
    private static ImageLoader imageLoader;

    private ImageLoader() {
    }

    //图片缓存,依赖抽象
    ImageCache imageCache = new MemoryCache();

    //线程池，线程数量为cpu的数量
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    // FIXME: 16/1/20
    //网络请求队列
    // FIXME: 16/1/20
    //图片配置对象
    ImageLoaderConfig config;

    // FIXME: 16/1/20
    //图片加载策略类
    LoadPolicy loadPolicy;

    //显示配置
    DisplayConfig displayConfig;

    /**
     * 通过配置类初始化ImageLoader，设置线程数量、缓存策略、加载策略
     * 必须要先初始化
     */
    public void init(ImageLoaderConfig config) {
        this.config = config;
        imageCache = config.getImageCache();
        mExecutorService = Executors.newFixedThreadPool(config.getThreadCount());
        loadPolicy = config.getLoadPolicy();
        displayConfig = config.getDisplayConfig();
    }

    /**
     * 静态内部类
     */
    private static class ImageLoaderHoldr {
        private static final ImageLoader imageLoader = new ImageLoader();
    }

    /**
     * 获取单例对象
     *
     * @return
     */
    public static ImageLoader getInstance() {
        return ImageLoaderHoldr.imageLoader;
    }

    /**
     * 防止反序列化新建对象
     *
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return ImageLoaderHoldr.imageLoader;
    }

    /**
     * 加载图片
     *
     * @param url
     * @param imageView
     */
    public void displayImage(final String url, final ImageView imageView) {
        displayImage(url, imageView, null, null);
    }

    /**
     * 加载图片
     *
     * @param url
     * @param imageView
     * @param listener
     */
    public void displayImage(final String url, final ImageView imageView, final ImageListener listener) {
        displayImage(url, imageView, null, null);
    }

    /**
     * 加载图片
     *
     * @param url
     * @param imageView
     * @param config
     * @param listener
     */
    public void displayImage(final String url, final ImageView imageView, DisplayConfig config, final ImageListener listener) {
        Bitmap bitmap = imageCache.get(url);

        //判断是否有缓存
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            if (listener != null) {
                listener.onComplete(imageView, bitmap, url);
            }
            return;
        }
        //没缓存，进行下载
        submitLoadRequest(url, imageView, listener);
    }


    /**
     * 下载图片
     *
     * @param url
     * @param imageView
     */
    private void submitLoadRequest(final String url, final ImageView imageView, final ImageListener listener) {
        //设置Tag
        imageView.setTag(url);
        //设置加载中显示图片
        imageView.setImageResource(displayConfig.loadingImageId);
        //开始下载
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downLoadImage(url);
                if (bitmap == null) {
                    //设置加载失败显示图片
                    imageView.setImageResource(displayConfig.loadFailedImageId);
                    return;
                }
                if (imageView.getTag().equals(url)) {
                    imageView.setImageBitmap(bitmap);
                    if (listener != null) {
                        listener.onComplete(imageView, bitmap, url);
                    }
                }
                //进行缓存
                imageCache.put(url, bitmap);
            }
        });
    }


    /**
     * 下载图片
     *
     * @param imageUrl
     * @return
     */
    private Bitmap downLoadImage(String imageUrl) {
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(conn.getInputStream());
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;
    }


    /**
     * 加载监听
     */
    public static interface ImageListener {
        public void onComplete(ImageView imageView, Bitmap bitmap, String url);
    }

}
