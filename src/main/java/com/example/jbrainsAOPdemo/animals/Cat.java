package com.example.jbrainsAOPdemo.animals;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {

    }
}
