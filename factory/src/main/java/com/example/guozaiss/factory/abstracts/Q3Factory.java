package com.example.guozaiss.factory.abstracts;

import com.example.guozaiss.factory.abstracts.brake.IBrake;
import com.example.guozaiss.factory.abstracts.brake.NormalBrake;
import com.example.guozaiss.factory.abstracts.engine.DomesticEngine;
import com.example.guozaiss.factory.abstracts.engine.IEngine;
import com.example.guozaiss.factory.abstracts.tire.ITire;
import com.example.guozaiss.factory.abstracts.tire.NormalTire;

/**
 * Created by guozaiss on 16/1/20.
 */
public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
