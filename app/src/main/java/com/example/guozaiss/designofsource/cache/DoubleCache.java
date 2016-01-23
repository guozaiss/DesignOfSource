package com.example.guozaiss.designofsource.cache;

import android.graphics.Bitmap;

/**
 * Created by guozaiss on 16/1/19.
 * 双缓存，先从内存中获取，在从SD卡获取，两面都进行存取。
 */
public class DoubleCache implements ImageCache {
    MemoryCache memoryCache =new MemoryCache();
    DiskCache diskCache=new DiskCache();

    /**
     * 先从内存缓存中获取，如果没有，再从Sd卡获取
     * @param url
     * @return
     */
    public Bitmap get(String url) {
        Bitmap bitmap = memoryCache.get(url);
        if (bitmap == null) {
            bitmap = diskCache.get(url);
        }
        return bitmap;
    }

    /**
     * 将图片缓存到内存和SD卡
     * @param url
     * @param bitmap
     */
    public void put(String url, Bitmap bitmap) {
        memoryCache.put(url,bitmap);
        diskCache.put(url,bitmap);
    }
}
