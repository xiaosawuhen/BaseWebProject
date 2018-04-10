package com.cn.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Companyinfo;
import com.cn.db.dao.CompanyinfoMapper;
import com.cn.service.CompanyinfoService;

@Service("companyinfoService")
public class CompanyinfoServiceImpl implements CompanyinfoService {

	@Autowired
	CompanyinfoMapper companyinfoMapper;

	@Transactional
	public Integer insertBatch(List<Companyinfo> list) {
		return companyinfoMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Companyinfo companyinfo) {
		return companyinfoMapper.insert(companyinfo);
	}

	@Transactional
	public List<Companyinfo> select(Map<String, String> map) {
		return companyinfoMapper.select(map);
	}

}
