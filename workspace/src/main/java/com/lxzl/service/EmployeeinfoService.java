package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeeinfo;

public interface EmployeeinfoService {

	List<Employeeinfo> select(Map<String, String> map);

}
