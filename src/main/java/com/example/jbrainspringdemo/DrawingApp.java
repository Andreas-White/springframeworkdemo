package com.example.jbrainspringdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Shape triangle = (Triangle) context.getBean("triangle");
        triangle.draw();

        Shape circle = (Circle) context.getBean("circle");
        circle.draw();
    }
}
