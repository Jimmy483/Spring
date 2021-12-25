package com.gmi.currency.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Crow implements Bird{

    @Autowired
    private Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void cry(){
        System.out.println("Caw Caw" + phone);
    }
}
