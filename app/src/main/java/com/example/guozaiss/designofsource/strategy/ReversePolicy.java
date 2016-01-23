package com.example.guozaiss.designofsource.strategy;

import com.example.guozaiss.designofsource.BitmapRequest;

/**
 * Created by guozaiss on 16/1/20.
 * 逆向加载策略
 */
public class ReversePolicy implements LoadPolicy {
    /**
     * 按照最晚加入队列的请求来执行
     * @param request1
     * @param request2
     * @return
     */
    @Override
    public int compare(BitmapRequest request1, BitmapRequest request2) {
        return request2.serialNum-request1.serialNum;
    }
}
