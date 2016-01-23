package com.example.guozaiss.singleton;

import java.io.ObjectStreamException;

/**
 * Created by guozaiss on 16/1/19.
 * 饿汉模式
 */
public class SingleTon {
    private static final SingleTon SINGLE_TON = new SingleTon();

    private SingleTon() {

    }

    public static SingleTon getSingleTon() {
        return SINGLE_TON;
    }

    /**
     * 钩子方法，可以控制对象的反序列化
     * 防止反序列化生成新的对象
     *
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return SINGLE_TON;
    }
}
