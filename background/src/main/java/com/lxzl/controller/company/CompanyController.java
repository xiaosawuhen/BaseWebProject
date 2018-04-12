package com.lxzl.controller.company;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxzl.db.transfor.bean.CompanyBean;
import com.lxzl.service.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping("/update")
	@ResponseBody
	public String updateInfo(@RequestBody CompanyBean company, HttpServletRequest request) {
		
		Integer cnt = companyService.updateById(company);
		
		return "{\"status\":\"success\"}";
	}
}
