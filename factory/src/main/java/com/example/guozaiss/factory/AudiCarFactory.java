package com.example.guozaiss.factory;

/**
 * Created by guozaiss on 16/1/20.
 */
public class AudiCarFactory extends AudiFactory {
    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> tClass) {
        AudiCar audiCar=null;
        try {
            audiCar= (AudiCar) Class.forName(tClass.getName()).newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)audiCar;
    }
}
