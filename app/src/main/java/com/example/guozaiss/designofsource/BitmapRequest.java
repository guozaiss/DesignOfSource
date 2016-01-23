package com.example.guozaiss.designofsource;

import com.example.guozaiss.designofsource.strategy.LoadPolicy;
import com.example.guozaiss.designofsource.strategy.SerialPolicy;

import java.util.Comparator;

/**
 * Created by guozaiss on 16/1/20.
 * bitmap加载排队者
 */
public class BitmapRequest implements Comparator<BitmapRequest> {
    public int serialNum;

    public BitmapRequest(int serialNum) {
        this.serialNum = serialNum;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    //加载策略
    LoadPolicy loadPolicy=new SerialPolicy();

    @Override
    public int compare(BitmapRequest lhs, BitmapRequest rhs) {
        //委托给LoadPolicy进行处理，实现按照策略模式
        return loadPolicy.compare(lhs,rhs);
    }
}
