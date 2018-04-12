package com.lxzl.controller.company;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
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
import com.lxzl.db.transfor.bean.CredentialBean;
import com.lxzl.db.transfor.bean.ProjectBean;
import com.lxzl.service.CredentialService;
import com.lxzl.service.upload.ImageUploadService;

@Controller
@RequestMapping("/company/credential")
public class CompanyCredentialController {
	
	@Autowired
	private CredentialService credentialService;
	
	@Autowired
	private ImageUploadService imageUploadService;

	@InitBinder  
	public void initBinder(WebDataBinder binder) {  
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
//	    dateFormat.setLenient(false);  
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));  
	}

	@RequestMapping("/list")
	public ModelAndView credentialList(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("company/credential/list");
		return mv;
	}

	@RequestMapping("/listByCondition")
	@ResponseBody
	public AjaxResultData<List<CredentialBean>> credentialListByCondition(@RequestBody String name, HttpServletRequest request){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("start", 0);
		paramMap.put("end", 10);
		Long cid = (Long)request.getSession().getAttribute(SessionConstant.COMPANY_ID);
		paramMap.put("cid", cid);
		List<CredentialBean> credentialList = credentialService.selectByCnt(paramMap);
		
		return new AjaxResultData<List<CredentialBean>>(AjaxResultEnum.SUCCESS,credentialList);
	}

	@RequestMapping
	public ModelAndView credentialImgList(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();

		Long cid = (Long)request.getSession().getAttribute(SessionConstant.COMPANY_ID);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("start", 0);
		paramMap.put("end", 10);
		paramMap.put("cid", cid);
		List<CredentialBean> credentialList = credentialService.selectByCnt(paramMap);
		
		mv.addObject("credentialList", credentialList);
		
		mv.setViewName("company/credential/imglist");
		return mv;
	}

	@RequestMapping("/add")
	public ModelAndView credentialAdd(){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("company/credential/add");
		return mv;
	}
	
	@RequestMapping("/add/submit")
	@ResponseBody
	public AjaxResultData<String> credentialAddSubmit(@RequestBody CredentialBean credentialBean, HttpServletRequest request){

		Long cid = (Long)request.getSession().getAttribute(SessionConstant.COMPANY_ID);
		
		credentialBean.setCid(cid);
		Integer cnt = credentialService.insert(credentialBean);
		
		return new AjaxResultData<String>(AjaxResultEnum.SUCCESS,"success");
	}

	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public ModelAndView credentialEdit(@RequestParam Long crid){
		ModelAndView mv = new ModelAndView();
		
		CredentialBean credential = credentialService.selectById(crid);
		
		mv.addObject("credential", credential);
		
		mv.setViewName("company/credential/edit");
		return mv;
	}

	@RequestMapping(value="/update")
	@ResponseBody
	public AjaxResultData<String> credentialUpdate(@RequestBody CredentialBean credentialBean, HttpServletRequest request){

		Long cid = (Long)request.getSession().getAttribute(SessionConstant.COMPANY_ID);

		credentialBean.setCid(cid);
		Integer cnt = credentialService.updateById(credentialBean);
		
		return new AjaxResultData<String>(AjaxResultEnum.SUCCESS,"success");
	}

	@RequestMapping(value="/delete")
	@ResponseBody
	public AjaxResultData<String> delete(@RequestBody Integer crid){
		
		Integer cnt = credentialService.deleteById(crid);
		
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
