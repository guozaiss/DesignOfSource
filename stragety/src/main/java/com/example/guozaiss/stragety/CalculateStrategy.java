package com.example.guozaiss.stragety;

/**
 * Created by guozaiss on 16/1/20.
 * 计算接口
 */
public interface CalculateStrategy {
    /**
     * 按距离来计算价格
     * @param km
     * @return
     */
    int calculatePrice(int km);
}
