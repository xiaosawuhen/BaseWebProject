package com.lxzl.db.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Services;

public interface ServicesService {

	Integer insertBatch(List<Services> list);

	Integer insert(Services services);

	List<Services> select(Map<String, String> map);

}
