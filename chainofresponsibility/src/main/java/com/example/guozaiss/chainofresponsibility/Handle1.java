package com.example.guozaiss.chainofresponsibility;

import android.util.Log;

/**
 * Created by guozaiss on 16/1/21.
 */
public class Handle1 extends  AbstractHandler {
    private static final String TAG="Handle1";
    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void Handle(AbstractRequest request) {
        Log.e(TAG, "处理了请求");
    }
}
