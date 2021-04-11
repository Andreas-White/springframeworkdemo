package com.example.jbrainspringdemo;

public class Triangle implements Shape {

    private String type;
    private int height;

    public Triangle (String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    /*public void setType(String type) {
        this.type = type;
    }*/

    public void draw() {
        if (getHeight() != 0 && getType() != null)
            System.out.println("Draw triangle of type " + getType() + " and height: " + getHeight());
        else if (getHeight() == 0)
            System.out.println("Draw triangle of type " + getType());
        else if (getType() == null)
            System.out.println("Draw triangle of height: " + getHeight());
    }
}
