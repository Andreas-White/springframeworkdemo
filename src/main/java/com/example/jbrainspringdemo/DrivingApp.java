package com.example.jbrainspringdemo;

import com.example.jbrainspringdemo.Cars.Car;
import com.example.jbrainspringdemo.Cars.Renault;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrivingApp {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring03.xml");
        context.registerShutdownHook();

        System.out.println("************************");
        System.out.println("-- Annotations : Resource, PostConstruct and PreDestroy --");
        Car renault = (Renault) context.getBean("renault");
        renault.drive();
    }
}
