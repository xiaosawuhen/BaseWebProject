package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customerestimateinfo;

public interface CustomerestimateinfoMapper {

	List<Customerestimateinfo> select(Map<String, String> map);

}
