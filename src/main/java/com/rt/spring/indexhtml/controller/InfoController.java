package com.rt.spring.indexhtml.controller;

import com.rt.spring.indexhtml.mapper.UserMapper;
import com.rt.spring.indexhtml.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class InfoController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/info")
    public String index(){
        List<User> list = userMapper.findall();
        
        return "info";
    }
}
