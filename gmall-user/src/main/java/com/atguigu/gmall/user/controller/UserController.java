package com.atguigu.gmall.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/aaa")
    public String index(){
        return "aaa";
    }
}
