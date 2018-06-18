package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Categoryinfo;

public interface CategoryinfoMapper {

	Integer insertBatch(List<Categoryinfo> list);

	Integer insert(Categoryinfo categoryinfo);

	List<Categoryinfo> select(Map<String, String> map);

}
