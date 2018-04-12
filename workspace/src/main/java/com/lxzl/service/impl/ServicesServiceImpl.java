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
	public Integer insertBatch(List<Services> list) {
		return servicesMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Services services) {
		return servicesMapper.insert(services);
	}

	@Transactional
	public List<Services> select(Map<String, String> map) {
		return servicesMapper.select(map);
	}

	public List<ServicesBean> selectByCnt(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer insert(ServicesBean servicesBean) {
		// TODO Auto-generated method stub
		return null;
	}

	public ServicesBean selectById(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer updateById(ServicesBean servicesBean) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer deleteById(Long sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
