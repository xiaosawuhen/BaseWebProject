package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Projectemployeeinfo;

public interface ProjectemployeeinfoMapper {

	List<Projectemployeeinfo> select(Map<String, String> map);

}
