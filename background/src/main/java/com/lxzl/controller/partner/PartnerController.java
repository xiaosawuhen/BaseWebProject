package com.lxzl.controller.partner;

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
import com.lxzl.db.transfor.bean.PartnerBean;
import com.lxzl.db.transfor.bean.ProjectBean;
import com.lxzl.service.PartnersService;
import com.lxzl.service.ProjectService;
import com.lxzl.service.upload.ImageUploadService;

@Controller
@RequestMapping("/partner")
public class PartnerController {

	@Autowired
	private PartnersService partnersService;
	
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
		
		mv.setViewName("partner/list");
		return mv;
	}

	@RequestMapping("/listByCondition")
	@ResponseBody
	public AjaxResultData<List<PartnerBean>> listByCondition(@RequestBody String name){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("start", 0);
		paramMap.put("end", 10);
		List<PartnerBean> employeeList = partnersService.selectByCnt(paramMap);
		
		return new AjaxResultData<List<PartnerBean>>(AjaxResultEnum.SUCCESS,employeeList);
	}

	@RequestMapping("/add")
	public ModelAndView add(){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("partner/add");
		return mv;
	}
	
	@RequestMapping("/add/submit")
	@ResponseBody
	public AjaxResultData<String> submit(@RequestBody PartnerBean partnerBean, HttpServletRequest request){

		Long cid = (Long)request.getSession().getAttribute(SessionConstant.COMPANY_ID);
		partnerBean.setCid(cid);
		
		Integer cnt = partnersService.insert(partnerBean);
		
		return new AjaxResultData<String>(AjaxResultEnum.SUCCESS,"success");
	}

	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public ModelAndView edit(@RequestParam Integer pid){
		ModelAndView mv = new ModelAndView();
		
		PartnerBean partner = partnersService.selectById(pid);
		
		mv.addObject("partner", partner);
		
		mv.setViewName("partner/edit");
		return mv;
	}

	@RequestMapping(value="/update")
	@ResponseBody
	public AjaxResultData<String> update(@RequestBody PartnerBean partnerBean){
		
		Integer cnt = partnersService.updateById(partnerBean);
		
		return new AjaxResultData<String>(AjaxResultEnum.SUCCESS,"success");
	}

	@RequestMapping(value="/delete")
	@ResponseBody
	public AjaxResultData<String> delete(@RequestBody PartnerBean partnerBean){
		
		Integer cnt = partnersService.deleteById(partnerBean.getPid());
		
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
