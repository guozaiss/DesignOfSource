package com.example.guozaiss.command;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.example.guozaiss.command.execise.CircleBrush;
import com.example.guozaiss.command.execise.DrawCanvas;
import com.example.guozaiss.command.execise.DrawPath;
import com.example.guozaiss.command.execise.IBrush;
import com.example.guozaiss.command.execise.NormalBrush;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener, View.OnClickListener {
    private DrawCanvas canvas;//绘制画布
    private DrawPath path;//路径绘制命令
    private Paint paint;//画笔对象
    private IBrush brush;//笔触对象

    private Button red;
    private Button green;
    private Button blue;
    private Button normal;
    private Button circle;
    private Button undo;
    private Button redo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paint = new Paint();
        paint.setColor(0xFFFFFFFF);
        paint.setStrokeWidth(3);

        brush=new NormalBrush();
        canvas = (DrawCanvas) findViewById(R.id.draw_canvas);
        canvas.setOnTouchListener(this);

        red = (Button) findViewById(R.id.red);
        green = (Button) findViewById(R.id.green);
        blue = (Button) findViewById(R.id.blue);
        normal = (Button) findViewById(R.id.Normal);
        circle = (Button) findViewById(R.id.Circle);
        undo = (Button) findViewById(R.id.undo);
        redo = (Button) findViewById(R.id.redo);

        red.setOnClickListener(this);
        green.setOnClickListener(this);
        blue.setOnClickListener(this);
        normal.setOnClickListener(this);
        circle.setOnClickListener(this);
        undo.setOnClickListener(this);
        redo.setOnClickListener(this);
//        Client client=new Client();
//        TetrisMachine machine=new TetrisMachine();
//        client.setFallCommand(new FallCommand(machine));
//        client.setLeftCommand(new LeftCommand(machine));
//        client.setRightCommand(new RightCommand(machine));
//        client.setTranCommand(new TranCommand(machine));
//        client.toDown();
//        client.toTran();
//        client.toRight();
//        client.toLeft();

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                path=new DrawPath();
                path.paint=paint;
                path.path = new Path();
                brush.down(path.path,event.getX(),event.getY());
                break;
            case MotionEvent.ACTION_MOVE:
                brush.move(path.path,event.getX(),event.getY());
                break;
            case MotionEvent.ACTION_UP:
                brush.up(path.path,event.getX(),event.getY());
                canvas.add(path);
                canvas.isDrawing=true;
                undo.setEnabled(true);
                redo.setEnabled(false);
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.red:
                paint.setColor(Color.RED);
                break;
            case R.id.green:
                paint.setColor(Color.GREEN);
                break;
            case R.id.blue:
                paint.setColor(Color.BLUE);
                break;
            case R.id.normal:
                brush=new NormalBrush();
                break;
            case R.id.Circle:
                brush=new CircleBrush();
                break;
            case R.id.undo:
                canvas.undo();
                if (!canvas.canUndo()) {
                    undo.setEnabled(false);
                }
                redo.setEnabled(true);
                break;
            case R.id.redo:
                canvas.redo();
                if (!canvas.canRedo()) {
                    redo.setEnabled(false);
                }
                undo.setEnabled(true);
                break;
        }
    }
}