package com.cn.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Company;
import com.cn.db.dao.CompanyMapper;
import com.cn.service.CompanyService;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyMapper companyMapper;

	@Transactional
	public Integer insertBatch(List<Company> list) {
		return companyMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Company company) {
		return companyMapper.insert(company);
	}

	@Transactional
	public List<Company> select(Map<String, String> map) {
		return companyMapper.select(map);
	}

}
