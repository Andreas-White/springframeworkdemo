package com.example.jbrainspringdemo.Shapes;

public class Square implements Shape{

    private Point A;
    private Point B;
    private Point C;
    private Point D;

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }

    public Point getD() {
        return D;
    }

    public void setD(Point d) {
        D = d;
    }

    @Override
    public void draw() {
        System.out.println("Point A of square: " + "(" + getA().getX() + ", " + getA().getY() + ")");
        System.out.println("Point B of square: " + "(" + getB().getX() + ", " + getB().getY() + ")");
        System.out.println("Point C of square: " + "(" + getC().getX() + ", " + getC().getY() + ")");
        System.out.println("Point D of square: " + "(" + getD().getX() + ", " + getD().getY() + ")");
    }
}
