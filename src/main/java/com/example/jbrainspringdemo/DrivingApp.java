package com.example.jbrainspringdemo;

import com.example.jbrainspringdemo.Cars.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrivingApp {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring03.xml");
        // destroys the beans
        //context.registerShutdownHook();

        System.out.println("************************");
        System.out.println("-- Annotations : Resource, PostConstruct and PreDestroy --");
        Car renault = (Renault) context.getBean("renault");
        renault.drive();

        System.out.println("************************");
        System.out.println("-- Annotations : Component, Service, Repository and Controller --");
        Car fiat = (Fiat) context.getBean("fiat");
        fiat.drive();

        System.out.println("************************");
        System.out.println("-- using messageSource for printing messages --");
        Car ford = (Ford) context.getBean("ford");
        ford.drive();

        System.out.println("************************");
        System.out.println("-- ApplicationEvent / ApplicationListener /ApplicationEventPublisher /ApplicationEventPublisherAware --");
        Car opel = (Opel) context.getBean("opel");
        opel.drive();

    }
}
