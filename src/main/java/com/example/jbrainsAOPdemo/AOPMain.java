package com.example.jbrainsAOPdemo;

import com.example.jbrainsAOPdemo.service.AnimalService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springAOP.xml");
        AnimalService service = context.getBean("animalService",AnimalService.class);

        System.out.println(service.getDog().getName());
        System.out.println(service.getCat().getName());
        System.out.println(service.getBird().getName());
    }
}
