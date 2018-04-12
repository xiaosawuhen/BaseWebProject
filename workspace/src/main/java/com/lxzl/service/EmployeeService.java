package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employee;
import com.lxzl.db.transfor.bean.EmployeeBean;

public interface EmployeeService {
	
	List<Employee> select(Map<String, String> map);

	List<EmployeeBean> selectByCompanyId(Long cid);

}
