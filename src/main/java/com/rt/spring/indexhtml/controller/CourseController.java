package com.rt.spring.indexhtml.controller;


import com.rt.spring.indexhtml.Service.CourseService;
import com.rt.spring.indexhtml.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/info2")
    public ModelAndView courseList(Model model){
        model.addAttribute("courseList",courseService.findall());
        return new ModelAndView("info2","courseModel",model);
    }


}
