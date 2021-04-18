package com.example.jbrainspringdemo.Countries;

import org.springframework.beans.factory.annotation.Required;

public class Greece implements Country{

    private City athens;
    private City argos;

    public City getAthens() {
        return athens;
    }

    public void setAthens(City athens) {
        this.athens = athens;
    }

    public City getArgos() {
        return argos;
    }

    public void setArgos(City argos) {
        this.argos = argos;
    }

    @Override
    public void travel() {
        System.out.println("You travelled to " + getAthens().getName());
        System.out.println("You travelled to " + getArgos().getName());
    }
}
