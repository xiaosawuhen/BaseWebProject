package com.cn.db.service;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Employeestatusinfo;

public interface EmployeestatusinfoService {

	Integer insertBatch(List<Employeestatusinfo> list);

	Integer insert(Employeestatusinfo employeestatusinfo);

	List<Employeestatusinfo> select(Map<String, String> map);

}
