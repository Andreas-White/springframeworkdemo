package com.example.jbrainspringdemo.Countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class USA implements Country{

    private City city1;
    private City city2;

    public City getCity1() {
        return city1;
    }

    @Autowired
    @Qualifier("city12")
    public void setCity1(City city1) {
        this.city1 = city1;
    }

    public City getCity2() {
        return city2;
    }

    @Autowired
    @Qualifier("city22")
    public void setCity2(City city2) {
        this.city2 = city2;
    }

    @Override
    public void travel() {
        System.out.println("You traveled to " + city1.getName());
        System.out.println("You traveled to " + city2.getName());
    }
}
