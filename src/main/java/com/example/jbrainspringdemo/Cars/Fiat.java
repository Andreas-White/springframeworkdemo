package com.example.jbrainspringdemo.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fiat implements Car{

    private HorsePower hpF;

    public HorsePower getHpF() {
        return hpF;
    }

    @Autowired
    public void setHpF(HorsePower hpF) {
        this.hpF = hpF;
    }

    @Override
    public void drive() {
        System.out.println("Fiat has " + getHpF().getHp() + " hp");
    }
}
