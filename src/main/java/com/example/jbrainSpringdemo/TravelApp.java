package com.example.jbrainSpringdemo;

import com.example.jbrainSpringdemo.Countries.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TravelApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring02.xml");

        // Object injection / BeanPostProcessor class display
        System.out.println("************************");
        System.out.println("--Object injection / BeanPostProcessor class display--");
        Country greece = (Country) context.getBean("greece");
        greece.travel();

        // Object injection / BeanFactoryPostProcessor class display / Initialising values of Beans through
        // city.config file
        System.out.println("************************");
        System.out.println("--Object injection / BeanFactoryPostProcessor class display / " +
                "Initialising values of Beans through city.config file --");
        Country sweden = (Country) context.getBean("sweden");
        sweden.travel();

        System.out.println("************************");
        System.out.println("-- Using Annotations / Required annotation --");
        Country egypt = (Egypt) context.getBean("egypt");
        egypt.travel();

        System.out.println("************************");
        System.out.println("-- Using Autowire annotation with a list of objects --");
        Country italy = (Italy) context.getBean("italy");
        italy.travel();

        System.out.println("************************");
        System.out.println("-- Using Autowire annotation with a single object City --");
        Country canada = (Canada) context.getBean("canada");
        canada.travel();

        System.out.println("************************");
        System.out.println("-- Using Autowire and Qualifier annotation with single objects City --");
        Country usa = (USA) context.getBean("u_s_a");
        usa.travel();
    }
}
