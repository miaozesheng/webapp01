package com.example.appweb01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: appweb01
 * @description: 第一个controller
 * @author: Mr.Miao
 * @create: 2021-01-23 17:28
 **/

@RestController
public class hiController {

    @GetMapping("/hi")
    @RequestMapping("/hi")
    public String hi(){
        return "hi springboot";
    }

}
