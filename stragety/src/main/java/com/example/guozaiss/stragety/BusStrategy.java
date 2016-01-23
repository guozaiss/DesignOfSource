package com.example.guozaiss.stragety;

/**
 * Created by guozaiss on 16/1/20.
 * 公交车策略类
 */
public class BusStrategy implements CalculateStrategy {
    /**
     * 公交车价格计算
     * @param km
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        //超过10公里的总距离
        int extraTotal = km - 10;
        //超过的距离是5公里的倍数
        int extreFactor = extraTotal / 5;
        //超过10公里对5公里取余
        int fraction = extraTotal % 5;
        //价格计算
        int price = 1 + extreFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}
