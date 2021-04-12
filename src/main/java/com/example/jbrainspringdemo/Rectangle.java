package com.example.jbrainspringdemo;

import java.util.List;

public class Rectangle implements Shape{

    List<Point> list;

    public List<Point> getList() {
        return list;
    }

    public void setList(List<Point> list) {
        this.list = list;
    }

    @Override
    public void draw() {
        for (Point p: list) {
            System.out.println("Point : " + "(" +p.getX() + ", " + p.getY() + ")");
        }
    }
}
