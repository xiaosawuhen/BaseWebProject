package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeestatusinfo;

public interface EmployeestatusinfoMapper {

	List<Employeestatusinfo> select(Map<String, String> map);

}
