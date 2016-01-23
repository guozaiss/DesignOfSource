package com.example.guozaiss.singleton;

import java.io.ObjectStreamException;

/**
 * Created by guozaiss on 16/1/19.
 * 静态内部类
 */
public class SingleTon4 {
    private SingleTon4() {

    }

    public static SingleTon4 getInstance() {
        return SingleTonHolder.SINGLE_TON_4;
    }

    /**
     * 静态内部类
     */
    private static class SingleTonHolder {
        private static final SingleTon4 SINGLE_TON_4 = new SingleTon4();
    }

    /**
     * 钩子方法，可以控制对象的反序列化
     * 防止反序列化生成新的对象
     *
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return SingleTonHolder.SINGLE_TON_4;
    }
}
