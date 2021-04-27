package com.example.jbrainsAOPdemo.service;

import com.example.jbrainsAOPdemo.animals.Bird;
import com.example.jbrainsAOPdemo.animals.Cat;
import com.example.jbrainsAOPdemo.animals.Dog;
import com.example.jbrainsAOPdemo.animals.Lion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnimalService {

    private Dog dog;
    private Cat cat;
    private Bird bird;
    private Lion lion;

    public Lion getLion() {
        return lion;
    }

    @Autowired
    @Qualifier("lionQ")
    public void setLion(Lion lion) {
        this.lion = lion;
        this.lion.makeNoise();
    }

    public Dog getDog() {
        return dog;
    }

    @Autowired
    @Qualifier("dogQ")
    public void setDog(Dog dog) {
        this.dog = dog;
        this.dog.makeNoise();
    }

    public Cat getCat() {
        return cat;
    }

    @Autowired
    @Qualifier("catQ")
    public void setCat(Cat cat) {
        this.cat = cat;
        this.cat.makeNoise();
    }

    public Bird getBird() {
        return bird;
    }

    @Autowired
    @Qualifier("birdQ")
    public void setBird(Bird bird) {
        this.bird = bird;
        this.bird.makeNoise();
    }
}
