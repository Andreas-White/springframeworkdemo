package com.example.jbrainsDataDemo.MySqlJdbcDemoApp;

import com.example.jbrainsDataDemo.MySqlJdbcDemoApp.dao.UserDao;
import com.example.jbrainsDataDemo.MySqlJdbcDemoApp.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springDemoApp.xml");
        UserDao dao = context.getBean("userDao", UserDao.class);

        User user1 = new User(1,"Andreas","1234##lm");
        User user2 = new User(2,"Tony","16542##lm");
        User user3 = new User(3,"Lara","@@46543##lm");
        User user4 = new User(4,"Bob","1234##544646");
        User user5 = new User(5,"Tina","poorPassword");
        /*dao.insertUser(user3);
        dao.insertUser(user4);
        dao.insertUser(user5);
        dao.deleteUser(user4);*/

        System.out.println("*************************");
        System.out.println("The name of user with id 5 is: " + dao.getUserName(user5.getId()));
        System.out.println();

        System.out.println("*************************");
        User user = dao.getUser(1);
        System.out.println("The name of user with id 1 is: " + user.getName());

        dao.updateUserName(user3,"Ntina");
        dao.updatePassword(user5,"56445$$))_");

        System.out.println("*************************");
        System.out.println("There are in total " + dao.getTotalNumberUsers() + " users");

        System.out.println("*************************");
        List<User> users = dao.getAllUsers();
        int count = 0;
        for (User us: users) {
            count++;
            System.out.println("User number " + count + " with name " + us.getName() + " and ID: " + us.getId());
        }
    }
}
