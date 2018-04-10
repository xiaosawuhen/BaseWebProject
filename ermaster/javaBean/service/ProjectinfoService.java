package com.cn.db.service;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Projectinfo;

public interface ProjectinfoService {

	Integer insertBatch(List<Projectinfo> list);

	Integer insert(Projectinfo projectinfo);

	List<Projectinfo> select(Map<String, String> map);

}
