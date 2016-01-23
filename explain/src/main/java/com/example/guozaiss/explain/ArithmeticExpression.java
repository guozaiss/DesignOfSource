package com.example.guozaiss.explain;

/**
 * Created by guozaiss on 16/1/21.
 * 抽象的算术运算解释器，为所有解释器共性的提取
 */
public abstract class ArithmeticExpression {
    /**
     * 抽象的解析方法
     * @return
     */
    public abstract int interpreter();
}
