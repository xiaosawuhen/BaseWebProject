package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Projectemployeeinfo;

public interface ProjectemployeeinfoService {

	List<Projectemployeeinfo> select(Map<String, String> map);

}
