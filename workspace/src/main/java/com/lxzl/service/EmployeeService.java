package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employee;

public interface EmployeeService {

	Integer insertBatch(List<Employee> list);

	Integer insert(Employee employee);

	List<Employee> select(Map<String, String> map);

}
