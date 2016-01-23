package com.example.guozaiss.designofsource.cache;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by guozaiss on 16/1/19.
 */
public class MemoryCache implements ImageCache {
    //内存缓存
    LruCache<String, Bitmap> memoryCache;


    public MemoryCache() {
        initImageCache();
    }

    private void initImageCache() {
        //计算可使用的最大内存
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        //取八分之一的可用内存
        final int cacheSize = maxMemory / 8;
        memoryCache = new LruCache<String, Bitmap>(cacheSize) {
            /**
             * ？？？？？
             * @param key
             * @param value
             * @return
             */
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight() / 1024;
            }
        };
    }

    public void put(String url, Bitmap bitmap) {
        memoryCache.put(url, bitmap);
    }

    public Bitmap get(String url) {
        return memoryCache.get(url);
    }
}
