package com.lxzl.controller.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/company")
public class CompanyController {

	@RequestMapping("credential")
	public ModelAndView credential(){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("company/credential");
		return mv;
	}
}
