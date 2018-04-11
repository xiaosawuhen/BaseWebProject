package com.lxzl.controller.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lxzl.ajax.AjaxResultData;
import com.lxzl.ajax.AjaxResultEnum;
import com.lxzl.db.bean.Company;
import com.lxzl.db.transfor.bean.CompanyBean;
import com.lxzl.db.transfor.bean.ProjectBean;
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

	@RequestMapping("/credential/list")
	public ModelAndView credential(){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("company/credential/list");
		return mv;
	}

	@RequestMapping("/credential/listByCondition")
	@ResponseBody
	public AjaxResultData<List<ProjectBean>> credentialListByCondition(@RequestBody String name){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("start", 0);
		paramMap.put("end", 10);
//		List<ProjectBean> employeeList = projectService.selectByCnt(paramMap);
		
		return new AjaxResultData<List<ProjectBean>>(AjaxResultEnum.SUCCESS,null);
	}

	@RequestMapping("/credential/add")
	public ModelAndView credentialAdd(){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("company/credential/add");
		return mv;
	}
	
	@RequestMapping("/credential/add/submit")
	@ResponseBody
	public AjaxResultData<String> credentialAddSubmit(@RequestBody ProjectBean projectBean){

//		Integer cnt = projectService.insert(projectBean);
		
		return new AjaxResultData<String>(AjaxResultEnum.SUCCESS,"success");
	}

	@RequestMapping(value="/credential/edit", method=RequestMethod.GET)
	public ModelAndView credentialEdit(@RequestParam Integer pid){
		ModelAndView mv = new ModelAndView();
		
//		ProjectBean project = projectService.selectById(pid);
		
//		mv.addObject("project", project);
		
		mv.setViewName("project/edit");
		return mv;
	}

	@RequestMapping(value="/credential/update")
	@ResponseBody
	public AjaxResultData<String> credentialUpdate(@RequestBody ProjectBean projectBean){
		
//		Integer cnt = projectService.updateById(projectBean);
		
		return new AjaxResultData<String>(AjaxResultEnum.SUCCESS,"success");
	}

	@RequestMapping(value="/credential/delete")
	@ResponseBody
	public AjaxResultData<String> delete(@RequestBody Integer pid){
		
//		Integer cnt = projectService.deleteById(pid);
		
		return new AjaxResultData<String>(AjaxResultEnum.SUCCESS,"success");
	}
}
