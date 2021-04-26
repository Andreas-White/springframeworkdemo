package com.example.jbrainsAOPdemo.service;

import com.example.jbrainsAOPdemo.animals.Bird;
import com.example.jbrainsAOPdemo.animals.Cat;
import com.example.jbrainsAOPdemo.animals.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnimalService {

    private Dog dog;
    private Cat cat;
    private Bird bird;

    public Dog getDog() {
        return dog;
    }

    @Autowired
    @Qualifier("dogQ")
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    @Autowired
    @Qualifier("catQ")
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Bird getBird() {
        return bird;
    }

    @Autowired
    @Qualifier("birdQ")
    public void setBird(Bird bird) {
        this.bird = bird;
    }
}
