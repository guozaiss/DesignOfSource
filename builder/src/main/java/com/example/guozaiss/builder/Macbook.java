package com.example.guozaiss.builder;

/**
 * Created by guozaiss on 16/1/19.
 * 具体计算机类
 */
public class Macbook extends Computer {
    protected Macbook() {
    }

    @Override
    public void setOS(String os) {
        mOS = os;
    }
}
