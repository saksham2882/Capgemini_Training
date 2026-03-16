package com.cg.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    // @Value("${city}")                          // NOTE: @Value -> it also override the setter method
    private String city;

    // @Value("${country}")
    private String country;

    // @Value("${zip}")
    private int zip;


    public Address() {}

    public Address(String city, String country, int zip) {
        this.city = city;
        this.country = country;
        this.zip = zip;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }


    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", zip=" + zip +
                '}';
    }
}