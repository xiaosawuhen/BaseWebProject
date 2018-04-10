package com.cn.db.dao;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Companyinfo;

public interface CompanyinfoMapper {

	Integer insertBatch(List<Companyinfo> list);

	Integer insert(Companyinfo companyinfo);

	List<Companyinfo> select(Map<String, String> map);

}
