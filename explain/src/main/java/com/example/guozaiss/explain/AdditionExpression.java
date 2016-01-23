package com.example.guozaiss.explain;

/**
 * Created by guozaiss on 16/1/21.
 * 加法运算抽象解释器
 */
public class AdditionExpression extends OperatorExpression {
    public AdditionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpreter() {
        return exp1.interpreter()+exp2.interpreter();
    }
}
