package com.example.guozaiss.designofsource.strategy;

import com.example.guozaiss.designofsource.BitmapRequest;

/**
 * Created by guozaiss on 16/1/20.
 * 加载策略类
 */
public interface LoadPolicy {
    int compare(BitmapRequest request1, BitmapRequest request2);

}
