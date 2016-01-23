package com.example.guozaiss.designofsource.cache;

import android.graphics.Bitmap;

/**
 * Created by guozaiss on 16/1/19.
 * 图片缓存接口
 */
public interface ImageCache {
    Bitmap get(String url);

    void put(String url, Bitmap bitmap);
}
