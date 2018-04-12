package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Serviceinfo;

public interface ServiceinfoMapper {

	List<Serviceinfo> select(Map<String, String> map);

}
