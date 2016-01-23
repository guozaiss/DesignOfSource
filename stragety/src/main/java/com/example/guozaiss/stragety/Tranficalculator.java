package com.example.guozaiss.stragety;

/**
 * Created by guozaiss on 16/1/20.
 * 策略托管类
 */
public class Tranficalculator {
    private CalculateStrategy strategy;

    public void setStrategy(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 托管计算
     * @param km
     * @return
     */
    public int calculatePrice(int km) {
        return strategy.calculatePrice(km);
    }
}
