package com.example.guozaiss.state.simple;

/**
 * Created by guozaiss on 16/1/21.
 * 电视状态接口，定义了电视操作的函数
 */
public interface TVState {

    void nextChannel();

    void preChannel();

    void turnUp();

    void turnDown();
}
