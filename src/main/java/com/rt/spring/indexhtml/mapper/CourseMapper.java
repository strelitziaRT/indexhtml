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

    @Update("update CourseTable set name=#{name} where id=#{id}")
    public void updateCourseNameById(@Param("name")String name,@Param("id")int id);

    @Delete("delete from CourseTable where id=#{id}")
    public void delById(@Param("id") int id);
}
