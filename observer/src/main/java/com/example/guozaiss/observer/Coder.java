package com.example.guozaiss.observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by guozaiss on 16/1/23.
 * 观察者
 */
public class Coder implements Observer {
    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void update(Observable observable, Object data) {
        Log.e("AAAA", name + " 内容：" + data);
    }
}
