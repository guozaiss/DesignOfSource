package com.example.guozaiss.factory.abstracts.brake;

import android.util.Log;

/**
 * Created by guozaiss on 16/1/20.
 */
public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        Log.e("AAAA", "普通制动");
    }
}
