package com.example.guozaiss.state.simple;

import android.util.Log;

/**
 * Created by guozaiss on 16/1/21.
 * 电视遥控器，含有开关、关机、下一频道、上一频道、调高音量、调低音量几个功能
 */
public class TVController {
    //开机状态
    private final static int POW_ON=1;
    //关机状态
    private final  static int POW_OFF=2;

    private int mState=POW_OFF;

    /**
     * 开机
     */
    public void powerOn(){
        if (mState == POW_OFF) {
            mState=POW_ON;
            Log.e("AAAA", "开机了");
        }
    }

    /**
     * 关机
     */
    public void powerOff() {
        if (mState == POW_ON) {
            mState=POW_OFF;
            Log.e("AAAA", "关机了");
        }
    }

    /**
     * 跳转下一频道
     */
    public void nextChannel() {
        if (mState == POW_ON) {
            Log.e("AAAA", "下一频道");
        }else {
            Log.e("AAAA", "没有开机");
        }
    }

    /**
     * 跳转上一频道
     */
    public void preChannel() {
        if (mState == POW_ON) {
            Log.e("AAAA", "上一频道");
        }else {
            Log.e("AAAA", "没有开机");
        }
    }

    /**
     * 调大音量
     */
    public void turnUp() {
        if (mState == POW_ON) {
            Log.e("AAAA", "调大音量");
        }else {
            Log.e("AAAA", "没有开机");
        }
    }

    /**
     * 调小音量
     */
    public void turnDown() {
        if (mState == POW_ON) {
            Log.e("AAAA", "调小音量");
        }else {
            Log.e("AAAA", "没有开机");
        }
    }
}
