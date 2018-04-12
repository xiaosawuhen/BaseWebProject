package com.lxzl.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lxzl.constant.SessionConstant;
import com.lxzl.db.transfor.bean.CompanyBean;
import com.lxzl.db.transfor.bean.CredentialBean;
import com.lxzl.db.transfor.bean.EmployeeBean;
import com.lxzl.db.transfor.bean.NewsBean;
import com.lxzl.db.transfor.bean.ProjectBean;
import com.lxzl.db.transfor.bean.ServicesBean;
import com.lxzl.service.CompanyService;
import com.lxzl.service.CredentialService;
import com.lxzl.service.EmployeeService;
import com.lxzl.service.NewsService;
import com.lxzl.service.ProjectService;
import com.lxzl.service.ServicesService;

@Controller
@RequestMapping("/")
public class HomePageController {

	@Autowired
	private CompanyService  companyService;
	
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private ProjectService projectService;

	@Autowired
	private CredentialService credentialService;

	@Autowired
	private NewsService newsService;

	@Autowired
	private ServicesService servicesService;
	
	@RequestMapping
	public ModelAndView home(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		
		Long cid = 18L;
		CompanyBean company = companyService.selectById(cid);
		request.getSession().setAttribute(SessionConstant.COMPANY_ID, company.getCid());
		
		List<ProjectBean> projectList = projectService.selectByCompanyId(company.getCid());

		List<EmployeeBean> employeeList = employeeService.selectByCompanyId(company.getCid());

		List<CredentialBean> credentialList = credentialService.selectByCompanyId(company.getCid());

		List<NewsBean> newsList = newsService.selectByCompanyId(company.getCid());

		List<ServicesBean> servicesList = servicesService.selectByCompanyId(company.getCid());

		mv.addObject("company", company);
		mv.addObject("projectList", projectList);
		mv.addObject("employeeList", employeeList);
		mv.addObject("credentialList", credentialList);
		mv.addObject("newsList", newsList);
		mv.addObject("servicesList", servicesList);
		
		mv.setViewName("index");
		return mv;
	}
}
