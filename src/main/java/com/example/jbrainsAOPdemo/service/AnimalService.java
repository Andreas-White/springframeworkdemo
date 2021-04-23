package com.example.jbrainsAOPdemo.service;

import com.example.jbrainsAOPdemo.animals.Bird;
import com.example.jbrainsAOPdemo.animals.Cat;
import com.example.jbrainsAOPdemo.animals.Dog;

public class AnimalService {

    private Dog dog;
    private Cat cat;
    private Bird bird;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Bird getBird() {
        return bird;
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }
}
