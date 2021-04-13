package com.example.jbrainspringdemo;

public class Pentagon implements Shape{

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;
    private Point pointE;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    public Point getPointE() {
        return pointE;
    }

    public void setPointE(Point pointE) {
        this.pointE = pointE;
    }

    @Override
    public void draw() {
        System.out.println("Point A of pentagon: " + "(" + getPointA().getX() + ", " + getPointA().getY() + ")");
        System.out.println("Point B of pentagon: " + "(" + getPointB().getX() + ", " + getPointB().getY() + ")");
        System.out.println("Point C of pentagon: " + "(" + getPointC().getX() + ", " + getPointC().getY() + ")");
        System.out.println("Point D of pentagon: " + "(" + getPointD().getX() + ", " + getPointD().getY() + ")");
        System.out.println("Point E of pentagon: " + "(" + getPointE().getX() + ", " + getPointE().getY() + ")");
    }
}
