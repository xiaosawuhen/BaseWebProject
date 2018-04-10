package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customerlevel;

public interface CustomerlevelMapper {

	Integer insertBatch(List<Customerlevel> list);

	Integer insert(Customerlevel customerlevel);

	List<Customerlevel> select(Map<String, String> map);

}
