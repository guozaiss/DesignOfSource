package com.example.guozaiss.chainofresponsibility;

import android.util.Log;

/**
 * Created by guozaiss on 16/1/21.
 */
public class Handle2 extends AbstractHandler {
    private static final String TAG = "Handle2";
    @Override
    protected int getHandleLevel() {
        return 2;
    }

    @Override
    protected void Handle(AbstractRequest request) {
        Log.e(TAG, "处理了请求");
    }
}
