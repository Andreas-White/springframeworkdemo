package com.example.jbrainsAOPdemo.animals;

import org.springframework.stereotype.Component;

@Component
public class Horse {

    private String name;
    //private RuntimeException exception;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        /*exception = new RuntimeException();
        throw exception;*/
    }

    public String makeNoise() {
        System.out.println("The horse makes a horse noise");
        return "The horse makes a horse noise";
    }

}
