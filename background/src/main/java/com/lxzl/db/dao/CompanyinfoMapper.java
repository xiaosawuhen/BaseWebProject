package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Companyinfo;
import com.lxzl.db.transfor.bean.CompanyBean;

public interface CompanyinfoMapper {

	Integer insertBatch(List<Companyinfo> list);

	Integer insert(CompanyBean companyinfo);

	List<Companyinfo> select(Map<String, String> map);

	Integer updateById(CompanyBean company);

}
