package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Companyemployeeinfo;

public interface CompanyemployeeinfoMapper {

	List<Companyemployeeinfo> select(Map<String, String> map);

}
