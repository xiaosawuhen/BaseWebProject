package com.lxzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Company;
import com.lxzl.db.dao.CompanyMapper;
import com.lxzl.db.transfor.bean.CompanyBean;
import com.lxzl.service.CompanyService;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyMapper companyMapper;

	@Transactional
	public List<Company> select(Map<String, String> map) {
		return companyMapper.select(map);
	}

	public CompanyBean selectById(Long cid) {
		return companyMapper.selectById(cid);
	}

}
