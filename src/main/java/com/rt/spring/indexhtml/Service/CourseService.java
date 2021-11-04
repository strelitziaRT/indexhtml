package com.rt.spring.indexhtml.Service;



import com.rt.spring.indexhtml.mapper.CourseMapper;
import com.rt.spring.indexhtml.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;

    public List<Course> findall() {
        return courseMapper.findall();
    };

    public void addCourse(Course course){
        courseMapper.addCourse(course);
    }
}
