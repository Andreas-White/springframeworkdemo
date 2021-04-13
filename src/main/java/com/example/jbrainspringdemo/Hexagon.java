package com.example.jbrainspringdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Hexagon implements Shape, ApplicationContextAware {

    private Point hexA;
    private Point hexB;
    private Point hexC;
    private Point hexD;
    private Point hexE;
    private Point hexF;
    private ApplicationContext context = null;

    public Point getHexA() {
        return hexA;
    }

    public void setHexA(Point hexA) {
        this.hexA = hexA;
    }

    public Point getHexB() {
        return hexB;
    }

    public void setHexB(Point hexB) {
        this.hexB = hexB;
    }

    public Point getHexC() {
        return (Point) context.getBean("hexC");
    }

    public void setHexC(Point hexC) {
        this.hexC = hexC;
    }

    public Point getHexD() {
        return (Point) context.getBean("hexD");
    }

    public void setHexD(Point hexD) {
        this.hexD = hexD;
    }

    public Point getHexE() {
        return (Point) context.getBean("hexE");
    }

    public void setHexE(Point hexE) {
        this.hexE = hexE;
    }

    public Point getHexF() {
        return (Point) context.getBean("hexF");
    }

    public void setHexF(Point hexF) {
        this.hexF = hexF;
    }

    @Override
    public void draw() {
        System.out.println("Point A of hexagon: " + "(" + getHexA().getX() + ", " + getHexA().getY() + ")");
        System.out.println("Point B of hexagon: " + "(" + getHexB().getX() + ", " + getHexB().getY() + ")");
        System.out.println("Point C of hexagon: " + "(" + getHexC().getX() + ", " + getHexC().getY() + ")");
        System.out.println("Point D of hexagon: " + "(" + getHexD().getX() + ", " + getHexD().getY() + ")");
        System.out.println("Point E of hexagon: " + "(" + getHexE().getX() + ", " + getHexE().getY() + ")");
        System.out.println("Point F of hexagon: " + "(" + getHexF().getX() + ", " + getHexF().getY() + ")");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
