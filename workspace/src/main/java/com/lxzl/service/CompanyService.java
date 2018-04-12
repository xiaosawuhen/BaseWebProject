package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Company;
import com.lxzl.db.transfor.bean.CompanyBean;

public interface CompanyService {

	List<Company> select(Map<String, String> map);

	CompanyBean selectById(Long cid);

}
