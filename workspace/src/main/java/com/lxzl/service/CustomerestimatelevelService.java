package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customerestimatelevel;

public interface CustomerestimatelevelService {

	List<Customerestimatelevel> select(Map<String, String> map);

}
