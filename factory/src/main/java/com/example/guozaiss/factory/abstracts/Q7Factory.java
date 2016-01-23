package com.example.guozaiss.factory.abstracts;

import com.example.guozaiss.factory.abstracts.brake.IBrake;
import com.example.guozaiss.factory.abstracts.brake.SeniorBrake;
import com.example.guozaiss.factory.abstracts.engine.IEngine;
import com.example.guozaiss.factory.abstracts.engine.ImportEngine;
import com.example.guozaiss.factory.abstracts.tire.ITire;
import com.example.guozaiss.factory.abstracts.tire.SUVTire;

/**
 * Created by guozaiss on 16/1/20.
 */
public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}
