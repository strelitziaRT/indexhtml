package com.rt.spring.indexhtml.controller;

import com.rt.spring.indexhtml.Service.CourseService;
import com.rt.spring.indexhtml.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseAddController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "/form";
    }

    @RequestMapping("/add")
    public String add(Course course){
        courseService.addCourse(course);
        return "redirect:/info2";
    }
}
