package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Companyemployeeinfo;
import com.cn.db.dao.CompanyemployeeinfoMapper;
import com.cn.db.service.CompanyemployeeinfoService;

@Service("companyemployeeinfoService")
public class CompanyemployeeinfoServiceImpl implements CompanyemployeeinfoService {

	@Autowired
	CompanyemployeeinfoMapper companyemployeeinfoMapper;

	@Transactional
	public Integer insertBatch(List<Companyemployeeinfo> list) {
		return companyemployeeinfoMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Companyemployeeinfo companyemployeeinfo) {
		return companyemployeeinfoMapper.insert(companyemployeeinfo);
	}

	@Transactional
	public List<Companyemployeeinfo> select(Map<String, String> map) {
		return companyemployeeinfoMapper.select(map);
	}

}
