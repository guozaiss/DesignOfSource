package com.example.guozaiss.designofsource.cache;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.guozaiss.designofsource.utils.CloseUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by guozaiss on 16/1/19.
 */
public class DiskCache implements ImageCache {
    static String cacheDir = "sdcard/cache/";

    //从SD缓存里去图片
    public Bitmap get(String url) {
        return BitmapFactory.decodeFile(cacheDir + url);
    }

    //将图片缓存到SD
    public void put(String url, Bitmap bitmap) {
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream = new FileOutputStream(cacheDir + url);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            CloseUtils.closeQuietly(fileOutputStream);
        }
    }
}
