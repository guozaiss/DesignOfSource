package com.example.guozaiss.prototype.execise;


/**
 * Created by guozaiss on 16/1/20.
 */
public class User implements Cloneable {
    public int age;
    public String name;
    public String phoneNum;
    public Address address;

    @Override
    public String toString() {
        return "User{" +
                "address=" + address +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    protected User clone(){
        try {
            User clone = (User) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
