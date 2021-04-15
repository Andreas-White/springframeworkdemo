package com.example.jbrainspringdemo.Shapes;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Octagon implements Shape, InitializingBean, DisposableBean {

    private Point octA;
    private Point octB;
    private Point octC;
    private Point octD;
    private Point octE;
    private Point octF;
    private Point octG;
    private Point octI;

    public Point getOctA() {
        return octA;
    }

    public void setOctA(Point octA) {
        this.octA = octA;
    }

    public Point getOctB() {
        return octB;
    }

    public void setOctB(Point octB) {
        this.octB = octB;
    }

    public Point getOctC() {
        return octC;
    }

    public void setOctC(Point octC) {
        this.octC = octC;
    }

    public Point getOctD() {
        return octD;
    }

    public void setOctD(Point octD) {
        this.octD = octD;
    }

    public Point getOctE() {
        return octE;
    }

    public void setOctE(Point octE) {
        this.octE = octE;
    }

    public Point getOctF() {
        return octF;
    }

    public void setOctF(Point octF) {
        this.octF = octF;
    }

    public Point getOctG() {
        return octG;
    }

    public void setOctG(Point octG) {
        this.octG = octG;
    }

    public Point getOctI() {
        return octI;
    }

    public void setOctI(Point octI) {
        this.octI = octI;
    }

    @Override
    public void draw() {
        System.out.println("Point A of octagon: " + "(" + getOctA().getX() + ", " + getOctA().getY() + ")");
        System.out.println("Point B of octagon: " + "(" + getOctB().getX() + ", " + getOctB().getY() + ")");
        System.out.println("Point C of octagon: " + "(" + getOctC().getX() + ", " + getOctC().getY() + ")");
        System.out.println("Point D of octagon: " + "(" + getOctD().getX() + ", " + getOctD().getY() + ")");
        System.out.println("Point E of octagon: " + "(" + getOctE().getX() + ", " + getOctE().getY() + ")");
        System.out.println("Point F of octagon: " + "(" + getOctF().getX() + ", " + getOctF().getY() + ")");
        System.out.println("Point G of octagon: " + "(" + getOctG().getX() + ", " + getOctG().getY() + ")");
        System.out.println("Point I of octagon: " + "(" + getOctI().getX() + ", " + getOctI().getY() + ")");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("InitialisingBeans init method called for Octagon class");
    }

    @Override
    public void destroy() {
        System.out.println("DisposableBean method called for Octagon class");
    }

    public void initMethod() {
        System.out.println("My init method called for Octagon class");
    }

    public void destroyBean() {
        System.out.println("My destroy method called for Octagon class");
    }
}
