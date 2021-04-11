package com.example.jbrainspringdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Constructor injection
        Shape triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
        // Setter injection
        Shape circle = (Circle) context.getBean("circle");
        circle.draw();

        // Object injection
        Shape polygon = (Polygon) context.getBean("polygon");
        polygon.draw();

    }
}
