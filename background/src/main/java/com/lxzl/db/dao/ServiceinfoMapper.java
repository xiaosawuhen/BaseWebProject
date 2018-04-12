package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Serviceinfo;
import com.lxzl.db.transfor.bean.ServicesBean;

public interface ServiceinfoMapper {

	Integer insertBatch(List<Serviceinfo> list);

	List<Serviceinfo> select(Map<String, String> map);

	Integer insert(ServicesBean servicesBean);

	Integer updateById(ServicesBean servicesBean);

	Integer deleteById(Long sid);

}
