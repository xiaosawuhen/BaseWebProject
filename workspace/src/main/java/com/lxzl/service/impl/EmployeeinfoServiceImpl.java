package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Employeeinfo;
import com.lxzl.db.dao.EmployeeinfoMapper;
import com.lxzl.service.EmployeeinfoService;

@Service("employeeinfoService")
public class EmployeeinfoServiceImpl implements EmployeeinfoService {

	@Autowired
	EmployeeinfoMapper employeeinfoMapper;

	@Transactional
	public List<Employeeinfo> select(Map<String, String> map) {
		return employeeinfoMapper.select(map);
	}

}
