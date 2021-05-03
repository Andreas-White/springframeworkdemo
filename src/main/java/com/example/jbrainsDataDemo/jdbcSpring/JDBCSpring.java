package com.example.jbrainsDataDemo.jdbcSpring;

import com.example.jbrainsDataDemo.jdbcSpring.dao.JDBCDaoSpring;
import com.example.jbrainsDataDemo.jdbcSpring.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springJdbc.xml");

        JDBCDaoSpring dao = context.getBean("JDBCDaoSpring", JDBCDaoSpring.class);
        Circle circle = dao.getCircle(1);
        System.out.println("Circle with id: " + circle.getId() + " and name: " + circle.getName());
        String circleName = dao.getCircleName(1);
        System.out.println(circleName);
        System.out.println(dao.getCircleCount());
    }
}
