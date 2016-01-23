package com.example.guozaiss.prototype.execise;

/**
 * Created by guozaiss on 16/1/20.
 */
public class Address {
    public String city;//城市
    public String district;//区
    public String street;//街道

    public Address(String city, String district, String street) {
        this.city = city;
        this.district = district;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
