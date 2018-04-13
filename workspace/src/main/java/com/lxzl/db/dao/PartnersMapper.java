package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Partners;

public interface PartnersMapper {

	Integer insertBatch(List<Partners> list);

	Integer insert(Partners partners);

	List<Partners> select(Map<String, String> map);

}
