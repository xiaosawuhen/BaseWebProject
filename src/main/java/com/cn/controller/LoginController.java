package com.cn.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cn.db.bean.User;
import com.cn.db.dao.UserMapper;
import com.cn.service.UserService;

@Controller
public class LoginController {

    private static Logger logger = LogManager.getLogger(LoginController.class.getName());
    
    @Autowired
	UserService userService; 

    @RequestMapping("/login")
    public ModelAndView login() {
    	logger.info("login");
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("url", "1111");
    	mv.setViewName("homePage");
        return mv;
    }
    
    @RequestMapping("/insert")
    @ResponseBody
    public String insert() {
    	logger.info("login");
    	
    	List<User> userList = new ArrayList<User>();
    	for (int i = 0; i < 1000000; i++) {
			User user = new User();
			user.setName("setName");
			user.setPassword("setPassword");
			user.setAge(1);
			user.setPhone("setPhone");
			user.setEmail("setEmail");
			userList.add(user);
		}
    	
    	userService.insertBatch(userList);
        return "success";
    }
}
