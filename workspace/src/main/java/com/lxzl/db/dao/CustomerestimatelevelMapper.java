package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customerestimatelevel;

public interface CustomerestimatelevelMapper {

	List<Customerestimatelevel> select(Map<String, String> map);

}
