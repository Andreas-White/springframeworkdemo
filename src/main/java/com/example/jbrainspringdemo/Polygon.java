package com.example.jbrainspringdemo;

public class Polygon implements Shape{

    private Point center;
    private Point upCenter;
    private Point downCenter;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getUpCenter() {
        return upCenter;
    }

    public void setUpCenter(Point upCenter) {
        this.upCenter = upCenter;
    }

    public Point getDownCenter() {
        return downCenter;
    }

    public void setDownCenter(Point downCenter) {
        this.downCenter = downCenter;
    }

    @Override
    public void draw() {
        System.out.println("Polygon with center: " + getCenter().getX() + "," + getCenter().getY()
                + "\nup center: " + getUpCenter().getX() + "," + getUpCenter().getY()
                + "\nand down center: " + getDownCenter().getX() + "," + getDownCenter().getY());
    }
}
