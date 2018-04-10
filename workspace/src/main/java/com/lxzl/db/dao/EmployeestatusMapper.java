package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Employeestatus;

public interface EmployeestatusMapper {

	Integer insertBatch(List<Employeestatus> list);

	Integer insert(Employeestatus employeestatus);

	List<Employeestatus> select(Map<String, String> map);

}
