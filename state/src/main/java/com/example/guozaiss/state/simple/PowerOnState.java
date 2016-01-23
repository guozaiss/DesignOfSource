package com.example.guozaiss.state.simple;

import android.util.Log;

/**
 * Created by guozaiss on 16/1/21.
 * 开机状态
 */
public class PowerOnState implements TVState {
    @Override
    public void nextChannel() {
        Log.e("AAAA", "下一频道");
    }

    @Override
    public void preChannel() {
        Log.e("AAAA", "上一频道");
    }

    @Override
    public void turnUp() {
        Log.e("AAAA", "调大音量");
    }

    @Override
    public void turnDown() {
        Log.e("AAAA", "调小音量");
    }
}
