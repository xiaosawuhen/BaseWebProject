package com.cn.db.dao;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Projectemployeeinfo;

public interface ProjectemployeeinfoMapper {

	Integer insertBatch(List<Projectemployeeinfo> list);

	Integer insert(Projectemployeeinfo projectemployeeinfo);

	List<Projectemployeeinfo> select(Map<String, String> map);

}
