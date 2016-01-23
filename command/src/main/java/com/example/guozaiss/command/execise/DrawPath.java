package com.example.guozaiss.command.execise;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by guozaiss on 16/1/23.
 * 具体绘制命令
 */
public class DrawPath implements IDraw {
    public Path path;//需要绘制的路径
    public Paint paint;//绘制画笔

    @Override
    public void draw(Canvas canvas) {
        canvas.drawPaint(paint);
    }

    @Override
    public void undo() {

    }
}
