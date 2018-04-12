package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Companyemployeeinfo;

public interface CompanyemployeeinfoService {

	List<Companyemployeeinfo> select(Map<String, String> map);

}
