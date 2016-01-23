package com.example.guozaiss.explain;

import java.util.Stack;

/**
 * Created by guozaiss on 16/1/21.
 * 处理与解释相关的一些业务
 */
public class Calculator {
    //声明一个Stack栈存储并操作所有相关的解释器
    public Stack<ArithmeticExpression> mExpStack = new Stack<ArithmeticExpression>();

    /**
     * 计算
     *
     * @param expression
     */
    public Calculator(String expression) {
        //声明两个Arithmetic类型的临时变量，存储运算符左右两边的数字解释器
        ArithmeticExpression exp1, exp2;
        //根据空格分隔表达字符串
        String[] elements = expression.split(" ");
        //循环遍历表达式元素数组
        for (int i = 0; i < elements.length; i++) {
            switch (elements[i].charAt(0)) {
                case '+':
                    exp1 = mExpStack.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    mExpStack.push(new AdditionExpression(exp1, exp2));
                    break;
                case '-':
                    exp1=mExpStack.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    mExpStack.push(new SubtrationExpression(exp1, exp2));
                    break;
                default:
                    mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }


    /**
     * 最终的计算结果
     *
     * @return
     */
    public int calculator() {

        return mExpStack.pop().interpreter();
    }
}
