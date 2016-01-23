package com.example.guozaiss.stragety;

/**
 * Created by guozaiss on 16/1/20.
 * 地铁价格策略类
 */
public class SubwayStrategy implements CalculateStrategy {
    /**
     * 地铁价格计算
     * @param km
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 4;
        } else if (km > 12 && km < 22) {
            return 5;
        } else if (km < 22 && km > 32) {
            return 6;
        }
        //其他
        return 7;
    }
}
