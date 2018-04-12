package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeeinfo;

public interface EmployeeinfoMapper {

	List<Employeeinfo> select(Map<String, String> map);

}
