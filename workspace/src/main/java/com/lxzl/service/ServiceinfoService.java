package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Serviceinfo;

public interface ServiceinfoService {

	List<Serviceinfo> select(Map<String, String> map);

}
