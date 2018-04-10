package com.cn.service;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Customerlevel;

public interface CustomerlevelService {

	Integer insertBatch(List<Customerlevel> list);

	Integer insert(Customerlevel customerlevel);

	List<Customerlevel> select(Map<String, String> map);

}
