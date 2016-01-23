package com.example.guozaiss.factory;

import android.util.Log;

/**
 * Created by guozaiss on 16/1/20.
 */
public class AudiQ1 extends AudiCar {
    @Override
    public void drive() {
        Log.e("AAAA", "AudiQ1启动了");
    }

    @Override
    public void selfNavigation() {
        Log.e("AAAA", "AudiQ1自动导航");
    }
}
