package com.example.guozaiss.state;

import android.content.Context;

/**
 * Created by guozaiss on 16/1/21.
 * 用户状态
 */
public interface UserState {
    /**
     * 转发
     * @param context
     */
    void forward(Context context);

    /**
     * 评论
     * @param context
     */
    void commit(Context context);
}
