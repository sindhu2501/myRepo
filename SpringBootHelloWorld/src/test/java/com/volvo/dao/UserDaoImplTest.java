package com.volvo.dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import junit.framework.Assert;

import org.junit.Test;

import com.volvo.entity.User;

public class UserDaoImplTest {

    @Test
    public void testGetUsers() {
        // UserDao userDao = new UserDaoImpl();
        // userDao.getUsers();

        User user1 = new User("1", "abc@abc.com", "A", "B");
        User user2 = new User("2", "xyz@abc.com", "D", "E");
        User user3 = new User("3", "iio@abc.com", "E", "Z");
        List<User> users = Arrays.asList(user1, user2, user3);
        List<User> filteredUsers = users.stream().filter(user -> user.getId().equals("1")).collect(Collectors.toList());
        Assert.assertTrue(filteredUsers.size() == 1);
    }

}
