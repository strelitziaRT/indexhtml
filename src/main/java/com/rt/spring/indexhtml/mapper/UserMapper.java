package com.rt.spring.indexhtml.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.rt.spring.indexhtml.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from UserService01")
    public List<User> findall();
}
