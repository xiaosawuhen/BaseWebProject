package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeestatusinfo;

public interface EmployeestatusinfoService {

	List<Employeestatusinfo> select(Map<String, String> map);

}
