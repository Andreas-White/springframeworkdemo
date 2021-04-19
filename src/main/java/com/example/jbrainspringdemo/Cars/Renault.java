package com.example.jbrainspringdemo.Cars;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Renault implements Car{

    private HorsePower hpR;

    public HorsePower getHpR() {
        return hpR;
    }

    @Autowired
    //@Resource  // same as Autowire
    public void setHpR(HorsePower hpR) {
        this.hpR = hpR;
    }

    @Override
    public void drive() {
        System.out.println("Renault has " + hpR.getHp() + " hp");
    }

    @PostConstruct
    public void initialiseRenault() {
        System.out.println("Init of Renault");
    }

    @PreDestroy
    public void destroyRenault() {
        System.out.println("Destroy of Renault");
    }
}
