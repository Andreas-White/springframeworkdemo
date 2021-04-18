package com.example.jbrainspringdemo.Countries;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class Egypt implements Country{

    private List<City> cities;

    public List<City> getCities() {
        return cities;
    }

    @Required
    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public void travel() {

        for (City c: cities
             ) {
            System.out.println("You traveled to: " + c.getName());
        }
    }
}
