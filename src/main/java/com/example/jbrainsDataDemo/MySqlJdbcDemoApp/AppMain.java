package com.example.jbrainsDataDemo.MySqlJdbcDemoApp;

import com.example.jbrainsDataDemo.MySqlJdbcDemoApp.dao.UserDao;
import com.example.jbrainsDataDemo.MySqlJdbcDemoApp.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springDemoApp.xml");
        UserDao dao = context.getBean("userDao", UserDao.class);

        User user1 = new User(2,"Tony","16542##lm");
        dao.insertUser(user1);
    }
}
