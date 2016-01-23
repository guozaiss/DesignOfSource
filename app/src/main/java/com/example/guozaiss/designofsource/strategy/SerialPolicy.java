package com.example.guozaiss.designofsource.strategy;

import com.example.guozaiss.designofsource.BitmapRequest;

/**
 * Created by guozaiss on 16/1/20.
 * 顺序加载
 */
public class SerialPolicy implements LoadPolicy {
    /**
     * 顺序加载策略，按照添加到到队列的序列号来进行执行
     * @param request1
     * @param request2
     * @return
     */
    @Override
    public int compare(BitmapRequest request1, BitmapRequest request2) {
        return request1.serialNum-request2.serialNum;
    }
}
