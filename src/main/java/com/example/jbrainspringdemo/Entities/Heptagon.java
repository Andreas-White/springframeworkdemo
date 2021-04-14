package com.example.jbrainspringdemo.Entities;

public class Heptagon implements Shape{

    private Point hepA;
    private Point hepB;
    private Point hepC;
    private Point hepD;
    private Point hepE;
    private Point hepF;
    private Point hepG;

    public Point getHepA() {
        return hepA;
    }

    public void setHepA(Point hepA) {
        this.hepA = hepA;
    }

    public Point getHepB() {
        return hepB;
    }

    public void setHepB(Point hepB) {
        this.hepB = hepB;
    }

    public Point getHepC() {
        return hepC;
    }

    public void setHepC(Point hepC) {
        this.hepC = hepC;
    }

    public Point getHepD() {
        return hepD;
    }

    public void setHepD(Point hepD) {
        this.hepD = hepD;
    }

    public Point getHepE() {
        return hepE;
    }

    public void setHepE(Point hepE) {
        this.hepE = hepE;
    }

    public Point getHepF() {
        return hepF;
    }

    public void setHepF(Point hepF) {
        this.hepF = hepF;
    }

    public Point getHepG() {
        return hepG;
    }

    public void setHepG(Point hepG) {
        this.hepG = hepG;
    }

    @Override
    public void draw() {
        System.out.println("Point A of heptagon: " + "(" + getHepA().getX() + ", " + getHepA().getY() + ")");
        System.out.println("Point B of heptagon: " + "(" + getHepB().getX() + ", " + getHepB().getY() + ")");
        System.out.println("Point C of heptagon: " + "(" + getHepC().getX() + ", " + getHepC().getY() + ")");
        System.out.println("Point D of heptagon: " + "(" + getHepD().getX() + ", " + getHepD().getY() + ")");
        System.out.println("Point E of heptagon: " + "(" + getHepE().getX() + ", " + getHepE().getY() + ")");
        System.out.println("Point F of heptagon: " + "(" + getHepF().getX() + ", " + getHepF().getY() + ")");
        System.out.println("Point G of heptagon: " + "(" + getHepG().getX() + ", " + getHepG().getY() + ")");
    }
}
