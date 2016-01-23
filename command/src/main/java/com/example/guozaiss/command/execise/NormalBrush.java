package com.example.guozaiss.command.execise;

import android.graphics.Path;

/**
 * Created by guozaiss on 16/1/23.
 * 普通笔触
 */
public class NormalBrush implements IBrush {
    @Override
    public void down(Path path, float x, float y) {
        path.moveTo(x, y);
    }

    @Override
    public void move(Path path, float x, float y) {
        path.lineTo(x, y);
    }

    @Override
    public void up(Path path, float x, float y) {

    }
}