package com.example.jbrainSpringdemo.Countries;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Italy implements Country{

    private List<City> cities;

    public List<City> getCities() {
        return cities;
    }

    @Autowired
    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public void travel() {
        for (City c: cities) {
            System.out.println("You traveled to: " + c.getName());
        }
    }
}
