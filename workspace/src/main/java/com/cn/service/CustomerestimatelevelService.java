package com.cn.service;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Customerestimatelevel;

public interface CustomerestimatelevelService {

	Integer insertBatch(List<Customerestimatelevel> list);

	Integer insert(Customerestimatelevel customerestimatelevel);

	List<Customerestimatelevel> select(Map<String, String> map);

}
