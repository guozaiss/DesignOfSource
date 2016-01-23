package com.example.guozaiss.command.execise;

import android.graphics.Path;

/**
 * Created by guozaiss on 16/1/23.
 * 抽象触笔
 */
public interface IBrush {

    /**
     * 触点接触时
     * @param path
     * @param x
     * @param y
     */
    void down(Path path,float x,float y);

    /**
     * 触点移动时
     * @param path
     * @param x
     * @param y
     */
    void move(Path path,float x,float y);

    /**
     * 触点离开时
     * @param path
     * @param x
     * @param y
     */
    void up(Path path,float x,float y);

}
