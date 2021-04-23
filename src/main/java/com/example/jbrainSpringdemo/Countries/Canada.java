package com.example.jbrainSpringdemo.Countries;

import org.springframework.beans.factory.annotation.Autowired;

public class Canada implements Country{

    private City toronto;

    public City getToronto() {
        return toronto;
    }

    @Autowired
    public void setToronto(City toronto) {
        this.toronto = toronto;
    }

    @Override
    public void travel() {
        System.out.println("You traveled to " + toronto.getName());
    }
}
