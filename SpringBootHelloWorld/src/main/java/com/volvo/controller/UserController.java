package com.volvo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.volvo.entity.User;
import com.volvo.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userService.getUsers();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/usersByName", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getUsersByName(@Param(value = "userName") String userName) {
        List<User> users = userService.getUsers();
        List<User> filteredUsers = users.stream().filter(user -> user.getName().equalsIgnoreCase(userName)).collect(Collectors.toList());
        return new ResponseEntity<List<User>>(filteredUsers, HttpStatus.OK);
    }

    @RequestMapping(value = "/emailByUserName", method = RequestMethod.GET)
    public ResponseEntity<String> getEmailByUserName(@Param(value = "userName") String userName) {
        List<User> users = userService.getUsers();
        List<User> filteredUsers = users.stream().filter(user -> user.getName().equalsIgnoreCase(userName)).collect(Collectors.toList());
        return new ResponseEntity<String>(filteredUsers.get(0).getEmailId(), HttpStatus.OK);
    }
}
