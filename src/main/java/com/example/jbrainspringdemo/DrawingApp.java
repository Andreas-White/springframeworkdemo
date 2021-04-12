package com.example.jbrainspringdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        System.out.println("************************");
        System.out.println("--Constructor injection--");
        // Constructor injection
        Shape triangle = (Triangle) context.getBean("triangle");
        triangle.draw();

        System.out.println("************************");
        System.out.println("--Setter injection--");
        // Setter injection
        Shape circle = (Circle) context.getBean("circle");
        circle.draw();

        System.out.println("************************");
        System.out.println("--Object injection--");
        // Object injection
        Shape polygon = (Polygon) context.getBean("polygon");
        polygon.draw();

        System.out.println("************************");
        System.out.println("--Object injection with inner beans--");
        // Object injection with inner beans
        Square square = (Square) context.getBean("square");
        square.draw();

    }
}
