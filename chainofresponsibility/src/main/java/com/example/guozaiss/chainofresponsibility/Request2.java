package com.example.guozaiss.chainofresponsibility;

/**
 * Created by guozaiss on 16/1/21.
 */
public class Request2 extends  AbstractRequest {
    public Request2(Object obj) {
        super(obj);
    }

    @Override
    public int getResquestLevel() {
        return 2;
    }
}
