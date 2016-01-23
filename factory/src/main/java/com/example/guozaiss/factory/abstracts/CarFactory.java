package com.example.guozaiss.factory.abstracts;

import com.example.guozaiss.factory.abstracts.brake.IBrake;
import com.example.guozaiss.factory.abstracts.engine.IEngine;
import com.example.guozaiss.factory.abstracts.tire.ITire;

/**
 * Created by guozaiss on 16/1/20.
 * 抽象工厂类
 */
public abstract class CarFactory {
    /**
     * 生产轮胎
     * @return
     */
    public abstract ITire createTire();

    /**
     * 生产引擎
     * @return
     */
    public abstract IEngine createEngine();

    /**
     * 生产制动
     * @return
     */
    public abstract IBrake createBrake();
}
