package com.lxzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Services;
import com.lxzl.db.dao.ServicesMapper;
import com.lxzl.db.transfor.bean.ServicesBean;
import com.lxzl.service.ServicesService;

@Service("servicesService")
public class ServicesServiceImpl implements ServicesService {

	@Autowired
	ServicesMapper servicesMapper;

	@Transactional
	public List<Services> select(Map<String, String> map) {
		return servicesMapper.select(map);
	}

	public List<ServicesBean> selectByCnt(Map<String, Object> paramMap) {
		return null;
	}

	public ServicesBean selectById(Integer sid) {
		return null;
	}

	public List<ServicesBean> selectByCompanyId(Long cid) {
		return servicesMapper.selectByCompanyId(cid);
	}

}
