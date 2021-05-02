package com.example.jbrainsDataDemo.jdbcNoSpring;

import com.example.jbrainsDataDemo.jdbcNoSpring.dao.JDBCDao;
import com.example.jbrainsDataDemo.jdbcNoSpring.model.Circle;

public class JDBCDemo {

    public static void main(String[] args) {
        Circle circle = new JDBCDao().getCircle(1);
        System.out.println(circle.getName());
    }
}
