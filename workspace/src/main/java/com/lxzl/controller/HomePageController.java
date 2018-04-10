package com.lxzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class HomePageController {

	@RequestMapping
	public String home() {
		return "index";
	}
}
