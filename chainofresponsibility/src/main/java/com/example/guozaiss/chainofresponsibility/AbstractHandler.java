package com.example.guozaiss.chainofresponsibility;

import android.util.Log;

/**
 * Created by guozaiss on 16/1/21.
 * 抽象处理者
 */
public abstract class AbstractHandler {
    //下一个节点的处理者对象
    protected AbstractHandler nexthandler;

    /**
     * 处理请求
     * @param request
     */
    public final void handleRequest(AbstractRequest request) {
        //判断请求级别与处理级别是否一致
        if (request.getResquestLevel() == getHandleLevel()) {
            //一致就处理对象
            Handle(request);
        }else {
            //否则将请求对象转发给下一个节点上的处理对象
            if (nexthandler!=null){
                nexthandler.handleRequest(request);
            }else {
                Log.e("AAAA", "所有的处理者都不能处理该请求");
            }
        }
    }

    /**
     * 获得处理者对象的处理级别
     * @return
     */
    protected abstract int  getHandleLevel();

    /**
     * 每个处理者的具体处理方式
     * @param request
     */
    protected abstract void Handle(AbstractRequest request);
}
