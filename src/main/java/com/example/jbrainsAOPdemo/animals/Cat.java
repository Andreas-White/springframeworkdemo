package com.example.jbrainsAOPdemo.animals;

import com.example.jbrainsAOPdemo.aspect.MyAroundAdvice;
import org.springframework.stereotype.Component;

@Component
public class Cat {

    private String name;

    public String getName() {
        return name;
    }

    @MyAroundAdvice
    public void setName(String name) {
        this.name = name;
    }


    public void makeNoise() {
        System.out.println("the cat meows");
    }
}
