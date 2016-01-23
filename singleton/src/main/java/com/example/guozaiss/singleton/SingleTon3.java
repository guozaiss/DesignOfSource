package com.example.guozaiss.singleton;

import java.io.ObjectStreamException;

/**
 * Created by guozaiss on 16/1/19.
 * Double CheckLock
 */
public class SingleTon3 {
    private static SingleTon3 singleTon3 = null;

    private SingleTon3() {

    }

    /**
     * 先判断单例对象是否为空，为空的话进入同步代码块，再二次判空，为空的话进行实例化
     *
     * @return
     */
    public static SingleTon3 getSingleTon3() {
        if (singleTon3 == null) {
            synchronized (SingleTon3.class) {
                if (singleTon3 == null) {
                    singleTon3 = new SingleTon3();
                }
            }
        }
        return singleTon3;
    }

    /**
     * 钩子方法，可以控制对象的反序列化
     * 防止反序列化生成新的对象
     *
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return singleTon3;
    }
}
