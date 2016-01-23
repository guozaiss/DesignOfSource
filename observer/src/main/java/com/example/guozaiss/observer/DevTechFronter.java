package com.example.guozaiss.observer;

import java.util.Observable;

/**
 * Created by guozaiss on 16/1/23.
 * 被观察者
 */
public class DevTechFronter extends Observable {
    public void post(String content){
        setChanged();
        notifyObservers(content);
    }


}
