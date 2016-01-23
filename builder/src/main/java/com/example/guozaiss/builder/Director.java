package com.example.guozaiss.builder;

/**
 * Created by guozaiss on 16/1/19.
 * Director类，复责构造computer
 */
public class Director {
    Builder builder=null;

    /**
     * 构造方法
     * @param builder
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String board, String display) {
        builder.builderBoard(board);
        builder.builderDisplay(display);
    }
}
