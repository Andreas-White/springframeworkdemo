package com.example.jbrainSpringdemo.Shapes;

public class Circle implements Shape{

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Draw circle with radius " + getRadius());
    }
}
