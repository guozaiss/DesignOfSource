package com.example.guozaiss.explain;

/**
 * Created by guozaiss on 16/1/21.
 */
public class SubtrationExpression extends OperatorExpression {
    public SubtrationExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpreter() {
        return exp1.interpreter()-exp2.interpreter();
    }
}
