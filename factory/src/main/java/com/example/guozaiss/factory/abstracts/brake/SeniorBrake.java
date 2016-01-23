package com.example.guozaiss.factory.abstracts.brake;

import android.util.Log;

/**
 * Created by guozaiss on 16/1/20.
 */
public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        Log.e("AAAA", "高级制动");
    }
}
