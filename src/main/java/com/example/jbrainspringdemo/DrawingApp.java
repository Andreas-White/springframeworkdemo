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
        Shape square = (Square) context.getBean("square");
        square.draw();

        // Object injection with list as property
        System.out.println("************************");
        System.out.println("--Object injection with list as property--");
        Shape rectangle = (Rectangle) context.getBean("rectangle");
        rectangle.draw();

        // Object injection with Autowiring
        System.out.println("************************");
        System.out.println("--Object injection with Autowiring--");
        Shape pentagon = (Pentagon) context.getBean("pentagon");
        pentagon.draw();

        // Object injection with ApplicationContextAware
        System.out.println("************************");
        System.out.println("--Object injection with ApplicationContextAware--");
        Shape hexagon = (Hexagon) context.getBean("hexagon");
        hexagon.draw();

    }
}
