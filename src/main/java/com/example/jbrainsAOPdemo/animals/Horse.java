package com.example.jbrainsAOPdemo.animals;

import com.example.jbrainsAOPdemo.aspect.MyAroundAdvice;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:animalconfig.properties")
public class Horse {

    private String name;
    //private RuntimeException exception;

    @MyAroundAdvice
    public String getName() {
        return name;
    }

    @Value("${horse.name}")
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
