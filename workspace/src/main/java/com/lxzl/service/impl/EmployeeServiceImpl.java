package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Employee;
import com.lxzl.db.dao.EmployeeMapper;
import com.lxzl.db.transfor.bean.EmployeeBean;
import com.lxzl.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeMapper employeeMapper;

	@Transactional
	public List<Employee> select(Map<String, String> map) {
		return employeeMapper.select(map);
	}

	public List<EmployeeBean> selectByCompanyId(Long cid) {
		return employeeMapper.selectByCompanyId(cid);
	}

}
