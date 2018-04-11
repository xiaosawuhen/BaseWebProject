package com.lxzl.controller.employee;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lxzl.ajax.AjaxResultData;
import com.lxzl.ajax.AjaxResultEnum;
import com.lxzl.db.transfor.bean.EmployeeBean;
import com.lxzl.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/list")
	public ModelAndView list(){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("employee/list");
		return mv;
	}

	@RequestMapping("/listByCondition")
	@ResponseBody
	public AjaxResultData<List<EmployeeBean>> listByCondition(@RequestBody String name){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("start", 0);
		paramMap.put("end", 10);
		List<EmployeeBean> employeeList = employeeService.selectByCnt(paramMap);
		
		return new AjaxResultData<List<EmployeeBean>>(AjaxResultEnum.SUCCESS,employeeList);
	}

	@RequestMapping("/add")
	public ModelAndView add(){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("employee/add");
		return mv;
	}
	
	@RequestMapping("/add/submit")
	@ResponseBody
	public AjaxResultData<String> submit(@RequestBody EmployeeBean employeeBean){

		employeeBean.setPassword(DigestUtils.md5Hex("123456".getBytes()));
		Integer cnt = employeeService.insert(employeeBean);
		
		return new AjaxResultData<String>(AjaxResultEnum.SUCCESS,"success");
	}
	

	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public ModelAndView edit(@RequestParam Integer eid){
		ModelAndView mv = new ModelAndView();
		
		EmployeeBean employee = employeeService.selectById(eid);
		
		mv.addObject("employee", employee);
		
		mv.setViewName("employee/edit");
		return mv;
	}

	@RequestMapping(value="/update")
	@ResponseBody
	public AjaxResultData<String> update(@RequestBody EmployeeBean employeeBean){
		
		Integer cnt = employeeService.updateById(employeeBean);
		
		return new AjaxResultData<String>(AjaxResultEnum.SUCCESS,"success");
	}

	@RequestMapping(value="/delete")
	@ResponseBody
	public AjaxResultData<String> delete(@RequestBody EmployeeBean employeeBean){
		
		Integer cnt = employeeService.deleteById(employeeBean.getEid());
		
		return new AjaxResultData<String>(AjaxResultEnum.SUCCESS,"success");
	}

	@RequestMapping(value="/uploadImg", method={RequestMethod.POST})
	@ResponseBody
	public AjaxResultData<Map<String, String>> uploadImg(HttpServletRequest request, HttpServletResponse response,
			@RequestParam MultipartFile file, String fileType) throws IOException {
		Map<String, String> result = new HashMap<String, String>();
		result.put("code", "200");
		
		result.put("image", "test");

		return new AjaxResultData<Map<String, String>>(AjaxResultEnum.SUCCESS,result);
	}
	
}
