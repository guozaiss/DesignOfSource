package com.example.guozaiss.factory.abstracts.tire;

import android.util.Log;

/**
 * Created by guozaiss on 16/1/20.
 */
public class SUVTire implements ITire {
    @Override
    public void tire() {
        Log.e("AAAA", "越野轮胎");
    }
}
