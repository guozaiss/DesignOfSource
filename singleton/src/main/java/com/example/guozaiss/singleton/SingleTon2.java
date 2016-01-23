package com.example.guozaiss.singleton;

import java.io.ObjectStreamException;

/**
 * Created by guozaiss on 16/1/19.
 * 懒汉模式
 */
public class SingleTon2 {
    private static SingleTon2 singleTon2;

    private SingleTon2() {

    }

    public static synchronized SingleTon2 getSingleTon2() {
        if (singleTon2 == null) {
            singleTon2 = new SingleTon2();
        }
        return singleTon2;
    }

    /**
     * 钩子方法，可以控制对象的反序列化
     * 防止反序列化生成新的对象
     *
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return singleTon2;
    }
}
