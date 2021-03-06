package com.lxzl.db.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Advantage;

public interface AdvantageService {

	Integer insertBatch(List<Advantage> list);

	Integer insert(Advantage advantage);

	List<Advantage> select(Map<String, String> map);

}
