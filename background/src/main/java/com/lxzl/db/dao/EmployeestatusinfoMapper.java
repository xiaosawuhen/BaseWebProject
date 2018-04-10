package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeestatusinfo;

public interface EmployeestatusinfoMapper {

	Integer insertBatch(List<Employeestatusinfo> list);

	Integer insert(Employeestatusinfo employeestatusinfo);

	List<Employeestatusinfo> select(Map<String, String> map);

}
