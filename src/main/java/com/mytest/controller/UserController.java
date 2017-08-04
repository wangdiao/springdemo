package com.mytest.controller;

import com.mytest.mapper.UserMapper;
import com.mytest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/username")
    @ResponseBody
    public String username() {
        List<User> users = userMapper.list();
        return users.get(0).getName();
    }
}
