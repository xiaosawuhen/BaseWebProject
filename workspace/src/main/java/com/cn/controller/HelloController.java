package com.cn.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.db.dao.UserMapper;

@Controller
public class HelloController {
    
	@Resource
	UserMapper persionMapper; 
	
    @RequestMapping("/hello")
    public @ResponseBody String hello() {
        return persionMapper.selectPersion(1).getName();
    }
}