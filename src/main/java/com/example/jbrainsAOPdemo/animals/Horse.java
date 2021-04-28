package com.example.jbrainsAOPdemo.animals;

public class Horse {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //throw (new RuntimeException());
    }

    public String makeNoise() {
        System.out.println("The horse makes a horse noise");
        return "The horse makes a horse noise";
    }

}
