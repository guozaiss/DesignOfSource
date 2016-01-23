package com.example.guozaiss.designofsource.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by guozaiss on 16/1/19.
 * 要关闭的对象，可以用这个工具类关闭流、游标dec
 */
public class CloseUtils {

    private CloseUtils() {
    }

    /**
     * 关闭Closeable对象
     *
     * @param closeable
     */
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
