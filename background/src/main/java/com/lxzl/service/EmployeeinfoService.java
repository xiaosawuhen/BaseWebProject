package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeeinfo;

public interface EmployeeinfoService {

	Integer insertBatch(List<Employeeinfo> list);

	Integer insert(Employeeinfo employeeinfo);

	List<Employeeinfo> select(Map<String, String> map);

	Employeeinfo selectByAliasName(String username);
}
