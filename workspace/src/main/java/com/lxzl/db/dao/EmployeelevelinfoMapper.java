package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeelevelinfo;

public interface EmployeelevelinfoMapper {

	List<Employeelevelinfo> select(Map<String, String> map);

}
