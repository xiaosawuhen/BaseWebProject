package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Services;

public interface ServicesMapper {

	Integer insertBatch(List<Services> list);

	Integer insert(Services services);

	List<Services> select(Map<String, String> map);

}
