package com.example.guozaiss.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guozaiss on 16/1/19.
 * 单例容器
 */
public class SingleTonManager {
    private static Map<String, Object> objMap = new HashMap<>();
    private SingleTonManager(){

    }

    public static void registerService(String key, Object instance) {
        if (!objMap.containsKey(key)) {
            try {
                Class<?> aClass = Class.forName(key);
                Object o = aClass.newInstance();
                objMap.put(key, o);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }

    public static Object getService(String key) {
        return objMap.get(key);
    }
}
