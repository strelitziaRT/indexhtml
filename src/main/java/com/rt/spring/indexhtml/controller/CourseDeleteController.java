package com.rt.spring.indexhtml.controller;

import com.rt.spring.indexhtml.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseDeleteController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/delete")
    public String delete(int id){
        courseService.delById(id);
        return "redirect:/info2";
    }
}
