package com.example.jbrainsAOPdemo.animals;

import com.example.jbrainsAOPdemo.aspect.MyAroundAdvice;
import org.springframework.stereotype.Component;

@Component
public class Dog {

    private String name;

    @MyAroundAdvice
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void makeNoise() {
        System.out.println("The dog barks");
    }
}
