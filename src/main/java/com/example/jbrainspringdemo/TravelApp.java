package com.example.jbrainspringdemo;

import com.example.jbrainspringdemo.Countries.Country;
import com.example.jbrainspringdemo.Countries.Greece;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TravelApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring02.xml");

        // Object injection / BeanPostProcessor class display
        System.out.println("************************");
        System.out.println("--Object injection / BeanPostProcessor class display--");
        Country greece = (Greece) context.getBean("greece");
        greece.travel();
    }
}
