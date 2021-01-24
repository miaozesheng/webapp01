package com.example.appweb01.mapper;

import com.example.appweb01.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("insert into user (username,password) values(#{username},#{password})")
    void addUser(User user);

    @Select("select * from user where username=#{username}")
    List<User> getUser(String username);

}
