package com.example.appweb01.controller;

import com.example.appweb01.domain.User;
import com.example.appweb01.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/**
 * @program: appweb01
 * @description: 第一个controller
 * @author: Mr.Miao
 * @create: 2021-01-23 17:28
 **/

@Controller
public class hiController {

    @Autowired
    private UserMapper userMapper;

    //@GetMapping("/register")
    @RequestMapping("/register")
    /**
     * @description: 用户注册，我们这里还完成了基于数据库的用户是否注册过的功能，
     * 如果用户注册过，那么我们会跳转到对应页面提示曾经注册过。
     * @Param
     * @return: java.lang.String
     */
    public String registerUser(HttpServletRequest request,HashMap<String,Object>hashMap) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username==null && password==null){
            return "register";
        }
        System.out.println(username);
        System.out.println(password);
        List<User> users= userMapper.getUser(username);

        if(users.size()!=0){
            hashMap.put("msg","the user has been registered!");
            return "registered";
        }else{
            User user = new User();
            hashMap.put("msg","the user has not been used");
            user.setUsername(username);
            user.setPassword(password);
            userMapper.addUser(user);
            return "success";
        }


    }



}
