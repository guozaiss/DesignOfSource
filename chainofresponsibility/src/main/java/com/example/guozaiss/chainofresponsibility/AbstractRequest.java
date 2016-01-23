package com.example.guozaiss.chainofresponsibility;

/**
 * Created by guozaiss on 16/1/21.
 * 抽象请求者
 */
public abstract class AbstractRequest {
    private Object obj;

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    /**
     * 获取处理的内容对象
     * @return
     */
    public Object getContent(){
        return obj;
    }

    /**
     * 获取请求级别
     * @return
     */
    public abstract int getResquestLevel();
}
