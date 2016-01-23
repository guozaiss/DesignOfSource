package com.example.guozaiss.command.execise;

import android.graphics.Path;

/**
 * Created by guozaiss on 16/1/23.
 * 圆形笔触
 */
public class CircleBrush implements IBrush {
    @Override
    public void down(Path path, float x, float y) {

    }

    @Override
    public void move(Path path, float x, float y) {
        path.addCircle(x,y,10, Path.Direction.CW);
    }

    @Override
    public void up(Path path, float x, float y) {

    }
}
