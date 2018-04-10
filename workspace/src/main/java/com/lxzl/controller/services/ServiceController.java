package com.lxzl.controller.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/services")
public class ServiceController {

	@RequestMapping
	public String home() {
		return "index";
	}
}
