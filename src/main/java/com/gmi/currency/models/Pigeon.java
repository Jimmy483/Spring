package com.gmi.currency.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pigeon implements Bird {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void cry(){
        System.out.println("Cuuu Cuuu");
    }
}
