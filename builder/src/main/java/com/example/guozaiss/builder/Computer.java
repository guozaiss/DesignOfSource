package com.example.guozaiss.builder;

/**
 * Created by guozaiss on 16/1/19.
 * 计算机抽象类
 */
public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer() {

    }

    /**
     * 设置键盘
     *
     * @param mBoard
     */
    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    /**
     * 设置显示屏
     *
     * @param mDisplay
     */
    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    /**
     * 设置操作系统
     */
    public abstract void setOS(String OS);


    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
