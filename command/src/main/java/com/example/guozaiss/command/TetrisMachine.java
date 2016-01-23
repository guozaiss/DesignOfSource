package com.example.guozaiss.command;

import android.util.Log;

/**
 * Created by guozaiss on 16/1/22.
 * 接受者角色
 */
public class TetrisMachine {
    /**
     * 真正处理“向左”操作的逻辑代码
     */
    public void toLeft() {
        Log.e("AAAA", "向左");
    }

    /**
     * 真正处理“向右”操作的逻辑代码
     */
    public void toRight() {
        Log.e("AAAA", "向右");
    }

    /**
     * 真正处理“快速落下”操作的逻辑代码
     */
    public void toDown() {
        Log.e("AAAA", "快速落下");
    }

    /**
     * 真正处理“变形”操作的逻辑代码
     */
    public void toTran() {
        Log.e("AAAA", "变形");
    }
}
