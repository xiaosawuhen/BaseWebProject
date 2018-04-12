package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Projectinfo;

public interface ProjectinfoService {

	List<Projectinfo> select(Map<String, String> map);

}
