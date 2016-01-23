package com.example.guozaiss.factory;

/**
 * Created by guozaiss on 16/1/20.
 * 抽象工厂类
 */
public abstract class AudiFactory {
    /**
     * 某车型的工厂方法
     * @param tClass
     * @param <T>
     * @return
     */
    public abstract <T extends AudiCar> T createAudiCar(Class<T> tClass);

}
