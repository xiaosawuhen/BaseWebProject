package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeestatus;

public interface EmployeestatusService {

	List<Employeestatus> select(Map<String, String> map);

}
