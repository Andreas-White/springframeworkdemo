package com.example.jbrainsDataDemo.jdbcSpring;

import com.example.jbrainsDataDemo.jdbcSpring.dao.JDBCDaoSpring;
import com.example.jbrainsDataDemo.jdbcSpring.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JDBCSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springJdbc.xml");

        JDBCDaoSpring dao = context.getBean("JDBCDaoSpring", JDBCDaoSpring.class);
        Circle circle3 = new Circle(3,"Third Circle");
        Circle circle4 = new Circle(4,"Fourth Circle");
        /*dao.insertCircle(circle3);
        dao.insertCircle(circle4);
        dao.deleteCircle(circle4);*/
        Circle circle = dao.getCircle(1);
        System.out.println("Circle with id: " + circle.getId() + " and name: " + circle.getName());
        String circleName = dao.getCircleName(1);
        System.out.println(circleName);
        System.out.println("There are " + dao.getCircleCount() + " Circle Objects in the database");
        List<Circle> circleList = dao.getAllCircles();
        for (Circle c: circleList) {
            System.out.println("Circle with id: " + c.getId() + " and name: " + c.getName());
        }
    }
}
