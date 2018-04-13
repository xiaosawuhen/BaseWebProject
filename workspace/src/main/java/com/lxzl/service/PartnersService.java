package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Partners;

public interface PartnersService {

	Integer insertBatch(List<Partners> list);

	Integer insert(Partners partners);

	List<Partners> select(Map<String, String> map);

}
