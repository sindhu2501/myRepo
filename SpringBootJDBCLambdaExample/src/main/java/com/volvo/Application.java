package com.volvo;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.volvo.dao.UserDao;
import com.volvo.entity.User;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private DataSource datasource;

    @Autowired
    private UserDao userDao;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        List<User> users = userDao.getUsers();
        users.forEach(user -> System.out.println(user));
    }
}
