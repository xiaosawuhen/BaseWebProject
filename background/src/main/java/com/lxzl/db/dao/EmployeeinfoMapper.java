package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Employeeinfo;
import com.lxzl.db.transfor.bean.EmployeeBean;

public interface EmployeeinfoMapper {

	Integer insertBatch(List<EmployeeBean> list);

	Integer insert(EmployeeBean employeeBean);

	List<Employeeinfo> select(Map<String, String> map);

	Employeeinfo selectByAliasName(@Param("aliasName")String aliasName);

	Integer updateById(EmployeeBean employeeBean);

	Integer deleteById(@Param("eid")Long eid);

}
