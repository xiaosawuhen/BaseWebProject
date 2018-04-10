package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Companyinfo;

public interface CompanyinfoMapper {

	Integer insertBatch(List<Companyinfo> list);

	Integer insert(Companyinfo companyinfo);

	List<Companyinfo> select(Map<String, String> map);

}
