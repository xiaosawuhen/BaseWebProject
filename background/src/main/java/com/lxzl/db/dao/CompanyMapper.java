package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Company;
import com.lxzl.db.transfor.bean.CompanyBean;

public interface CompanyMapper {

	Integer insertBatch(List<Company> list);

	Integer insert(CompanyBean company);

	List<Company> select(Map<String, String> map);

	CompanyBean getInfoByName(@Param("name")String name);

	Integer updateById(CompanyBean company);

	CompanyBean selectById(@Param("id")Long id);

	Company selectByUserName(@Param("username")String username);
}
