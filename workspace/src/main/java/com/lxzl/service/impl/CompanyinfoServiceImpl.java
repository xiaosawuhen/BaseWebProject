package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Companyinfo;
import com.lxzl.db.dao.CompanyinfoMapper;
import com.lxzl.service.CompanyinfoService;

@Service("companyinfoService")
public class CompanyinfoServiceImpl implements CompanyinfoService {

	@Autowired
	CompanyinfoMapper companyinfoMapper;

	@Transactional
	public List<Companyinfo> select(Map<String, String> map) {
		return companyinfoMapper.select(map);
	}

}
