package com.example.jbrainspringdemo;

public class Triangle implements Shape {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw() {
        System.out.println(getType() +" Draw triangle");
    }
}
