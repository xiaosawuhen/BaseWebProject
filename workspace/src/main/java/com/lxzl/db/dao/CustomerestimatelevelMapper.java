package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customerestimatelevel;

public interface CustomerestimatelevelMapper {

	Integer insertBatch(List<Customerestimatelevel> list);

	Integer insert(Customerestimatelevel customerestimatelevel);

	List<Customerestimatelevel> select(Map<String, String> map);

}
