package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Employee;
import com.lxzl.db.transfor.bean.EmployeeBean;

public interface EmployeeMapper {

	Integer insertBatch(List<EmployeeBean> list);

	Integer insert(EmployeeBean employeeBean);

	List<Employee> select(Map<String, String> map);

	List<EmployeeBean> selectByCnt(Map<String, Object> map);

	EmployeeBean selectById(@Param("eid")Integer eid);

	Integer updateById(EmployeeBean employeeBean);

	Integer deleteById(@Param("eid")Long eid);

}
