package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Projectinfo;

public interface ProjectinfoMapper {

	Integer insertBatch(List<Projectinfo> list);

	Integer insert(Projectinfo projectinfo);

	List<Projectinfo> select(Map<String, String> map);

}
