package com.volvo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.volvo.dao.UserDao;
import com.volvo.entity.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    public List<User> getUsers() {
        return dao.getUsers();
    }

}
