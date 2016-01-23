package com.example.guozaiss.builder;

/**
 * Created by guozaiss on 16/1/19.
 * 抽象Builder类
 */
public abstract class Builder {
    /**
     * 设置主机
     * @param board
     */
    abstract Builder builderBoard(String board);

    /**
     * 设置显示屏
     * @param display
     */
    abstract Builder builderDisplay(String display);

    /**
     * 设置操作系统
     */
    abstract Builder builderOS(String OS);

    /**
     * 创建Computer,用于展示产品类
     * @return
     */
    public abstract Computer create();
}
