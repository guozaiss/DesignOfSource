package com.example.guozaiss.chainofresponsibility;

/**
 * Created by guozaiss on 16/1/21.
 * 具体请求者1
 */
public class Request1 extends AbstractRequest {
    public Request1(Object obj) {
        super(obj);
    }

    @Override
    public int getResquestLevel() {
        return 1;
    }
}
