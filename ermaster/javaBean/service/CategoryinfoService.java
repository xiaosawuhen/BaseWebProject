package com.lxzl.db.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Categoryinfo;

public interface CategoryinfoService {

	Integer insertBatch(List<Categoryinfo> list);

	Integer insert(Categoryinfo categoryinfo);

	List<Categoryinfo> select(Map<String, String> map);

}
