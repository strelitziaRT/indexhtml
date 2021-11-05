package com.rt.spring.indexhtml.mapper;

import com.rt.spring.indexhtml.pojo.Course;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseMapper {
    @Select("select * from CourseTable")
    public List<Course> findall();

    @Insert("insert into CourseTable values(null,#{course.name},#{course.dept})")
    @Options(keyProperty="course.id",useGeneratedKeys=true)
    public void addCourse(@Param("course")Course course);

    @Update("update CourseTable set name=#{course.name},dept=#{course.dept} where id=#{course.id}")
    public void updateCourseNameById(@Param("course")Course course);

    @Delete("delete from CourseTable where id=#{id}")
    public void delById(@Param("id") int id);

    @Select("select * from CourseTable where id =#{id}")
    public Course get(int id);

}
