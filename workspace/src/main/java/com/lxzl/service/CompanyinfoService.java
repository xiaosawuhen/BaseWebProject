package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Companyinfo;

public interface CompanyinfoService {

	List<Companyinfo> select(Map<String, String> map);

}
