package com.cn.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.db.dao.CustomerMapper;
import com.cn.db.dao.UserMapper;

@Controller
public class HelloController {
    
	@Resource
	CustomerMapper customerMapper; 
	
    @RequestMapping("/hello")
    public @ResponseBody String hello() {
        return customerMapper.select(new HashMap<String, String>()).get(0).getName();
    }
}
