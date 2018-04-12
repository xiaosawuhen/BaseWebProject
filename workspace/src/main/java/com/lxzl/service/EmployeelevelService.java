package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeelevel;

public interface EmployeelevelService {

	List<Employeelevel> select(Map<String, String> map);

}
