package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employee;

public interface EmployeeMapper {

	Integer insertBatch(List<Employee> list);

	Integer insert(Employee employee);

	List<Employee> select(Map<String, String> map);

}
