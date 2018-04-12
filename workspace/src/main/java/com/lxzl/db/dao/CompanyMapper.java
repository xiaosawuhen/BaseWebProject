package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Company;
import com.lxzl.db.transfor.bean.CompanyBean;

public interface CompanyMapper {

	List<Company> select(Map<String, String> map);

	CompanyBean selectById(@Param("cid")Long cid);

}
