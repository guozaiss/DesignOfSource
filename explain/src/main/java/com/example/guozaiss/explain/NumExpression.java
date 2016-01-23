package com.example.guozaiss.explain;

/**
 * Created by guozaiss on 16/1/21.
 * 数字解释器
 */
public class NumExpression extends ArithmeticExpression {
    private int num;

    public NumExpression(int num) {
        this.num=num;
    }

    /**
     * 具体解析方法
     * @return
     */
    @Override
    public int interpreter() {
        return num;
    }
}
