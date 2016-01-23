package com.example.guozaiss.designofsource;

import com.example.guozaiss.designofsource.cache.ImageCache;
import com.example.guozaiss.designofsource.cache.MemoryCache;
import com.example.guozaiss.designofsource.strategy.LoadPolicy;

/**
 * Created by guozaiss on 16/1/20.
 * 图片加载配置，有问题！！！！！
 */
public class ImageLoaderConfig {
    //图片缓存配置对象
    private ImageCache imageCache = new MemoryCache();
    //加载图片  加载时、加载失败的配置对象
    private DisplayConfig displayConfig = new DisplayConfig();
    // FIXME: 16/1/20
    //加载策略
    private LoadPolicy loadPolicy;
    //线程数量，
    private int threadCount = Runtime.getRuntime().availableProcessors() + 1;

    private ImageLoaderConfig() {

    }

    public DisplayConfig getDisplayConfig() {
        return displayConfig;
    }

    public ImageCache getImageCache() {
        return imageCache;
    }

    public LoadPolicy getLoadPolicy() {
        return loadPolicy;
    }

    public int getThreadCount() {
        return threadCount;
    }

    /**
     * 配置类的Builder
     */
    public static class Builder {
        //图片缓存配置对象
        ImageCache imageCache = new MemoryCache();
        //加载图片  加载时、加载失败的配置对象
        DisplayConfig displayConfig = new DisplayConfig();
        // FIXME: 16/1/20
        //加载策略
        LoadPolicy loadPolicy;
        //线程数量，
        int threadCount = Runtime.getRuntime().availableProcessors() + 1;

        /**
         * 设置加载中图片Id
         *
         * @param resId
         * @return
         */
        public Builder builderLoadingImageId(int resId) {
            this.displayConfig.loadingImageId = resId;
            return this;
        }

        /**
         * 设置加载失败图片Id
         *
         * @param resId
         * @return
         */
        public Builder builderLoadFailedImageId(int resId) {
            this.displayConfig.loadFailedImageId = resId;
            return this;
        }

        /**
         * 设置图片缓存策略
         *
         * @param imageCache
         * @return
         */
        public Builder builderImageCache(ImageCache imageCache) {
            this.imageCache = imageCache;
            return this;
        }

        /**
         * 设置图片加载策略
         *
         * @param loadPolicy
         */
        public Builder builderLoadPolicy(LoadPolicy loadPolicy) {
            if (loadPolicy != null) {
                this.loadPolicy = loadPolicy;
            }
            return this;
        }

        /**
         * 设置线程数量
         *
         * @param threadCount
         */
        public Builder builderThreadCount(int threadCount) {
            this.threadCount = Math.max(1, threadCount);
            return this;
        }

        private void applyConfig(ImageLoaderConfig config) {
            config.displayConfig = this.displayConfig;
            config.imageCache = this.imageCache;
            config.loadPolicy = this.loadPolicy;
            config.threadCount = this.threadCount;
        }

        public ImageLoaderConfig create() {
            ImageLoaderConfig config = new ImageLoaderConfig();
            //应用配置
            applyConfig(config);
            return config;
        }
    }

}
