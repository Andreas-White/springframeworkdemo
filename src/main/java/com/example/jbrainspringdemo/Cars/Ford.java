package com.example.jbrainspringdemo.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ford implements Car{

    private HorsePower hpF;

    public HorsePower getHpF() {
        return hpF;
    }

    @Autowired
    @Qualifier("fordR")
    public void setHpF(HorsePower hpF) {
        this.hpF = hpF;
    }

    @Override
    public void drive() {
        System.out.println("Ford has " + getHpF().getHp() + " hp");
    }
}
