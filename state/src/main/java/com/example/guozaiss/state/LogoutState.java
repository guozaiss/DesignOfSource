package com.example.guozaiss.state;

import android.content.Context;
import android.util.Log;

/**
 * Created by guozaiss on 16/1/21.
 * 注销状态，即未登录状态
 */
public class LogoutState implements UserState {
    @Override
    public void forward(Context context) {
        Log.e("AAAA", "用户未登录，即将跳转到登录界面");
    }

    @Override
    public void commit(Context context) {
        Log.e("AAAA", "用户未进行登录，即将跳转到登录界面");
    }
}
