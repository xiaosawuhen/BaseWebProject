package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customerinfo;

public interface CustomerinfoService {

	List<Customerinfo> select(Map<String, String> map);
	
	Customerinfo selectByAliasName(String aliasName);
}
