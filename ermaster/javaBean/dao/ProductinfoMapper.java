package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Productinfo;

public interface ProductinfoMapper {

	Integer insertBatch(List<Productinfo> list);

	Integer insert(Productinfo productinfo);

	List<Productinfo> select(Map<String, String> map);

}
