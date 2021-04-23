package com.example.jbrainsAOPdemo.animals;

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
