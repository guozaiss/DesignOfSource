package com.example.guozaiss.state;

import android.content.Context;
import android.util.Log;

/**
 * Created by guozaiss on 16/1/21.
 * 已登录状态
 */
public class LoginedState implements UserState {
    @Override
    public void forward(Context context) {
        Log.e("AAAA", "用户转发了");
    }

    @Override
    public void commit(Context context) {
        Log.e("AAAA", "用户进行评论");
    }
}
