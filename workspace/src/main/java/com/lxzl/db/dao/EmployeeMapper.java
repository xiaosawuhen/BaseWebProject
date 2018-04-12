package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Employee;
import com.lxzl.db.transfor.bean.EmployeeBean;

public interface EmployeeMapper {

	List<Employee> select(Map<String, String> map);

	List<EmployeeBean> selectByCompanyId(@Param("cid")Long cid);

}
