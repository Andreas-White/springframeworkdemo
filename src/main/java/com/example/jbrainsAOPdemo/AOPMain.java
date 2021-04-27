package com.example.jbrainsAOPdemo;

import com.example.jbrainsAOPdemo.service.AnimalService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springAOP.xml");
        AnimalService service = context.getBean("animalService",AnimalService.class);

        System.out.println("\n\t************************");
        System.out.println("The name of the dog is " + service.getDog().getName());
        System.out.println("\n\t************************");
        System.out.println("The name of the cat is " + service.getCat().getName());
        System.out.println("\n\t************************");
        System.out.println("The name of the bird is " + service.getBird().getName());
        System.out.println("\n\t************************");
        System.out.println("The name of the lion is " + service.getLion().getName());
        System.out.println("\n\t************************");
        service.getHorse().setName("Klara");
        System.out.println("The name of the horse is " + service.getHorse().getName());
    }
}
