package com.example.jbrainsAOPdemo.animals;

import org.springframework.stereotype.Component;

@Component
public class Bird {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void makeNoise() {
        System.out.println("The bird sings");
    }
}
