package com.rt.spring.indexhtml.controller;

import com.rt.spring.indexhtml.Service.CourseService;
import com.rt.spring.indexhtml.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseUpdateController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/toUpdate")
    public String toUpdate(int id, Model model){
        Course course = courseService.get(id);
        model.addAttribute("course", course);
        return "update_form";
    }
    @RequestMapping ("/update")
    public String update(Course course){
        courseService.updateCourseNameById(course);
        return "redirect:/info2";
    }
}
