package com.example.jbrainspringdemo;

import com.example.jbrainspringdemo.Countries.Country;
import com.example.jbrainspringdemo.Countries.Egypt;
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
    }
}
