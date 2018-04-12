package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customerestimateinfo;

public interface CustomerestimateinfoService {

	List<Customerestimateinfo> select(Map<String, String> map);

}
