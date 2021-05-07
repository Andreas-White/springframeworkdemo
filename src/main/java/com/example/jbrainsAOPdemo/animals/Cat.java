package com.example.jbrainsAOPdemo.animals;

import com.example.jbrainsAOPdemo.aspect.MyAroundAdvice;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:animalconfig.properties")
public class Cat {

    private String name;

    @MyAroundAdvice
    public String getName() {
        return name;
    }

    @Value("${cat.name}")
    public void setName(String name) {
        this.name = name;
    }


    public void makeNoise() {
        System.out.println("the cat meows");
    }
}
