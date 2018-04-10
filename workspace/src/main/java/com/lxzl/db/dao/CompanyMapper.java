package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Company;

public interface CompanyMapper {

	Integer insertBatch(List<Company> list);

	Integer insert(Company company);

	List<Company> select(Map<String, String> map);

}
