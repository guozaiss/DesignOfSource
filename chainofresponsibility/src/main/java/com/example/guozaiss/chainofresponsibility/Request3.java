package com.example.guozaiss.chainofresponsibility;

/**
 * Created by guozaiss on 16/1/21.
 */
public class Request3 extends AbstractRequest {
    public Request3(Object obj) {
        super(obj);
    }

    @Override
    public int getResquestLevel() {
        return 3;
    }
}
