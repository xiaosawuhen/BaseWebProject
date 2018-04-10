package com.cn.db.service;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Customerestimateinfo;

public interface CustomerestimateinfoService {

	Integer insertBatch(List<Customerestimateinfo> list);

	Integer insert(Customerestimateinfo customerestimateinfo);

	List<Customerestimateinfo> select(Map<String, String> map);

}
