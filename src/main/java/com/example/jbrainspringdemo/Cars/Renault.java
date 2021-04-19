package com.example.jbrainspringdemo.Cars;

import org.springframework.beans.factory.annotation.Autowired;

public class Renault implements Car{

    private HorsePower hpR;

    public HorsePower getHpR() {
        return hpR;
    }

    @Autowired
    public void setHpR(HorsePower hpR) {
        this.hpR = hpR;
    }

    @Override
    public void drive() {
        System.out.println("Renault has " + hpR.getHp() + " hp");
    }
}
