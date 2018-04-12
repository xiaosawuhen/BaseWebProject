package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Serviceinfo;

public interface ServiceinfoMapper {

	Integer insertBatch(List<Serviceinfo> list);

	Integer insert(Serviceinfo serviceinfo);

	List<Serviceinfo> select(Map<String, String> map);

}
