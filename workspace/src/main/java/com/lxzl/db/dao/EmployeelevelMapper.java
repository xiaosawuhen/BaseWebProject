package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeelevel;

public interface EmployeelevelMapper {

	List<Employeelevel> select(Map<String, String> map);

}
