package com.cn.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Employee;
import com.cn.db.dao.EmployeeMapper;
import com.cn.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeMapper employeeMapper;

	@Transactional
	public Integer insertBatch(List<Employee> list) {
		return employeeMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Employee employee) {
		return employeeMapper.insert(employee);
	}

	@Transactional
	public List<Employee> select(Map<String, String> map) {
		return employeeMapper.select(map);
	}

}
