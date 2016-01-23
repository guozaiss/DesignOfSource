package com.example.guozaiss.state.simple;

import android.util.Log;

/**
 * Created by guozaiss on 16/1/21.
 */
public class TVControllerNew implements PowerController {

    private TVState tvState;

    public void setTvState(TVState tvState) {
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        Log.e("AAAA", "开机了");
    }

    @Override
    public void powerOff() {
        setTvState(new PoweroffState());
        Log.e("AAAA", "关机了");
    }

    /**
     * 跳转下一频道
     */
    public void nextChannel() {
        tvState.nextChannel();
    }

    /**
     * 跳转上一频道
     */
    public void preChannel() {
        tvState.preChannel();
    }

    /**
     * 调大音量
     */
    public void turnUp() {
        tvState.turnUp();
    }

    /**
     * 调小音量
     */
    public void turnDown() {
        tvState.turnDown();
    }
}
