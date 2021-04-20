package com.example.jbrainspringdemo.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Component
//@Service    // If it was a service class (in our case works the same as @Component)
//@Repository // If it was a data type (in our case works the same as @Component)
//@Controller   // If it was a controller (from MVC) type (in our case works the same as @Component)
public class Fiat implements Car{

    private HorsePower hpF;

    public HorsePower getHpF() {
        return hpF;
    }

    @Autowired
    //@Resource  //same as autowire
    @Qualifier("fiatR")
    public void setHpF(HorsePower hpF) {
        this.hpF = hpF;
    }

    @Override
    public void drive() {
        System.out.println("Fiat has " + getHpF().getHp() + " hp");
    }
}
