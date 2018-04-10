package com.cn.db.dao;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Company;

public interface CompanyMapper {

	Integer insertBatch(List<Company> list);

	Integer insert(Company company);

	List<Company> select(Map<String, String> map);

}
