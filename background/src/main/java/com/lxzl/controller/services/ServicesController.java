package com.lxzl.controller.services;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lxzl.ajax.AjaxResultData;
import com.lxzl.ajax.AjaxResultEnum;
import com.lxzl.constant.SessionConstant;
import com.lxzl.db.transfor.bean.NewsBean;
import com.lxzl.db.transfor.bean.ServicesBean;
import com.lxzl.service.ServicesService;
import com.lxzl.service.upload.ImageUploadService;

@Controller
@RequestMapping("/services")
public class ServicesController {

	@Autowired
	private ServicesService servicesService;
	
	@Autowired
	private ImageUploadService imageUploadService;
	
	@InitBinder  
	public void initBinder(WebDataBinder binder) {  
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
//	    dateFormat.setLenient(false);  
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));  
	}
	
	@RequestMapping("/list")
	public ModelAndView list(){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("services/list");
		return mv;
	}

	@RequestMapping("/listByCondition")
	@ResponseBody
	public AjaxResultData<List<ServicesBean>> listByCondition(@RequestBody String name){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("start", 0);
		paramMap.put("end", 10);
		List<ServicesBean> employeeList = servicesService.selectByCnt(paramMap);
		
		return new AjaxResultData<List<ServicesBean>>(AjaxResultEnum.SUCCESS,employeeList);
	}

	@RequestMapping("/add")
	public ModelAndView add(){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("services/add");
		return mv;
	}
	
	@RequestMapping("/add/submit")
	@ResponseBody
	public AjaxResultData<String> submit(@RequestBody ServicesBean servicesBean, HttpServletRequest request){

		Long cid = (Long)request.getSession().getAttribute(SessionConstant.COMPANY_ID);
		servicesBean.setCid(cid);
		
		Integer cnt = servicesService.insert(servicesBean);
		
		return new AjaxResultData<String>(AjaxResultEnum.SUCCESS,"success");
	}

	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public ModelAndView edit(@RequestParam Integer sid){
		ModelAndView mv = new ModelAndView();
		
		ServicesBean servicesBean = servicesService.selectById(sid);
		
		mv.addObject("project", servicesBean);
		
		mv.setViewName("services/edit");
		return mv;
	}

	@RequestMapping(value="/update")
	@ResponseBody
	public AjaxResultData<String> update(@RequestBody ServicesBean servicesBean){
		
		Integer cnt = servicesService.updateById(servicesBean);
		
		return new AjaxResultData<String>(AjaxResultEnum.SUCCESS,"success");
	}

	@RequestMapping(value="/delete")
	@ResponseBody
	public AjaxResultData<String> delete(@RequestBody ServicesBean servicesBean){
		
		Integer cnt = servicesService.deleteById(servicesBean.getSid());
		
		return new AjaxResultData<String>(AjaxResultEnum.SUCCESS,"success");
	}

	@RequestMapping(value="/uploadImg", method={RequestMethod.POST})
	@ResponseBody
	public AjaxResultData<Map<String, String>> uploadImg(HttpServletRequest request, HttpServletResponse response,
			@RequestParam MultipartFile file, String fileType) throws IOException {
		Map<String, String> result = new HashMap<String, String>();
		
		String imgUrl = imageUploadService.uploadFile(file, request);

		result.put("code", "200");
		result.put("image", imgUrl);

		return new AjaxResultData<Map<String, String>>(AjaxResultEnum.SUCCESS,result);
	}
}
