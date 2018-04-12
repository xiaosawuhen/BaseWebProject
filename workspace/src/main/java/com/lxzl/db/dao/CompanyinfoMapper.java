package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Companyinfo;

public interface CompanyinfoMapper {

	List<Companyinfo> select(Map<String, String> map);

}
