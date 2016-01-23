package com.example.guozaiss.command.execise;

import android.graphics.Canvas;

/**
 * Created by guozaiss on 16/1/23.
 * 抽象命令对象
 */
public interface IDraw {

    /**
     * 绘制命令
     * @param canvas
     */
    void draw(Canvas canvas);

    /**
     * 撤销命令
     */
    void undo();
}
