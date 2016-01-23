package com.example.guozaiss.stragety;

/**
 * Created by guozaiss on 16/1/20.
 * 价钱计算类
 */
public class PriceCalculator {
    //公交车类型
    private static final int BUS = 1;
    //地铁类型
    private static final int SUBWAY = 2;

    /**
     * 公交车，10公里一块钱、超过后每块可乘5公里
     *
     * @param km
     * @return
     */
    private int busPrice(int km) {
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

    /**
     * 六公里内 3元   6~12：4   12~22：5    22~32：6
     *
     * @param km
     * @return
     */
    private int subwayPrice(int km) {
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

    /**
     * 计算价格
     * @param km
     * @param type
     * @return
     */
    public int calcultorPrice(int km, int type) {
        if (type == BUS) {
            return busPrice(km);
        } else if (type == SUBWAY) {
            return subwayPrice(km);
        }
        return 0;
    }
}
