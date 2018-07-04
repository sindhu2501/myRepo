package com.volvo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.volvo.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getUsers() {
        return jdbcTemplate.query("select id, email_Id, name, password from USER_DETAILS",
                                  (rs, rowNum) -> new User(rs.getString("id"), rs.getString("email_Id"), rs.getString("name"), rs.getString("password")));
    }

}
