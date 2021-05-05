package com.example.jbrainsDataDemo.jdbcSpring;

import com.example.jbrainsDataDemo.jdbcSpring.dao.JDBCDaoCircle;
import com.example.jbrainsDataDemo.jdbcSpring.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JDBCSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springJdbc.xml");

        JDBCDaoCircle daoCircle = context.getBean("JDBCDaoCircle", JDBCDaoCircle.class);

        // Manipulation of Circle objects

        Circle circle3 = new Circle(3,"Third Circle");
        Circle circle4 = new Circle(4,"Fourth Circle");
        /*daoCircle.insertCircle(circle3);
        daoCircle.insertCircle(circle4);
        daoCircle.deleteCircle(circle4);*/
        Circle circle = daoCircle.getCircle(1);
        System.out.println("Circle with id: " + circle.getId() + " and name: " + circle.getName());
        String circleName = daoCircle.getCircleName(1);
        System.out.println(circleName);
        System.out.println("There are " + daoCircle.getCircleCount() + " Circle Objects in the database");
        List<Circle> circleList = daoCircle.getAllCircles();
        for (Circle c: circleList) {
            System.out.println("Circle with id: " + c.getId() + " and name: " + c.getName());
        }


    }
}
