package com.example.guozaiss.command.execise;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by guozaiss on 16/1/23.
 */
public class DrawCanvas extends SurfaceView implements SurfaceHolder.Callback {
    public boolean isDrawing, isRuning;//标识是否可以绘制，绘制线程是否可以运行

    private Bitmap bitmap;//绘制到的位图对象
    private DrawInvoker invoker;//绘制命令请求对象
    private DrawThread thread;//绘制线程

    public DrawCanvas(Context context) {
        super(context);
    }

    public DrawCanvas(Context context, AttributeSet attrs) {
        super(context, attrs);
        invoker = new DrawInvoker();
        thread = new DrawThread();
        getHolder().addCallback(this);
    }

    public DrawCanvas(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 增加一条绘制路径
     *
     * @param path
     */
    public void add(DrawPath path) {
        invoker.add(path);
    }

    /**
     * 重做上一步撤销的绘制
     */
    public void redo() {
        isDrawing = true;
        invoker.redo();
    }

    /**
     * 撤销上一步的绘制
     */
    public void undo() {
        isDrawing = true;
        invoker.undo();
    }

    /**
     * 是否可以撤销
     *
     * @return
     */
    public boolean canUndo() {
        return invoker.canUndo();
    }

    /**
     * 是否可以重做
     *
     * @return
     */
    public boolean canRedo() {
        return invoker.canRedo();
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        isRuning = true;
        thread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry = true;
        isRuning = false;
        while (retry) {
            try {
                thread.join();
                retry = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class DrawThread extends Thread {
        @Override
        public void run() {
            Canvas canvas = null;
            while (isDrawing) {
                try {
                    canvas = getHolder().lockCanvas(null);
                    if (bitmap == null) {
                        bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    }
                    Canvas canvas1 = new Canvas(bitmap);
                    canvas1.drawColor(0, PorterDuff.Mode.CLEAR);
                    invoker.execute(canvas1);
                    canvas.drawBitmap(bitmap, 0, 0, null);
                } finally {
                    getHolder().unlockCanvasAndPost(canvas);
                }
                isDrawing = false;
            }
        }
    }
}
