package com.cn.db.dao;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Customerestimateinfo;

public interface CustomerestimateinfoMapper {

	Integer insertBatch(List<Customerestimateinfo> list);

	Integer insert(Customerestimateinfo customerestimateinfo);

	List<Customerestimateinfo> select(Map<String, String> map);

}
