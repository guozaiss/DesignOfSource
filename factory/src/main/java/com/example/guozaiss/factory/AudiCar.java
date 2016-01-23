package com.example.guozaiss.factory;

/**
 * Created by guozaiss on 16/1/20.
 * 汽车抽象类
 */
public abstract class AudiCar {
    /**
     * 定义汽车的一个行为方法 车可以自动开走
     */
    public abstract void drive();

    /**
     * 定义汽车的一个行为方法 车可以自动巡航
     */
    public abstract void selfNavigation();

}
