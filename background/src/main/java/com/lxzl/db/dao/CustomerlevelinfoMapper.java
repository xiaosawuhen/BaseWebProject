package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customerlevelinfo;

public interface CustomerlevelinfoMapper {

	Integer insertBatch(List<Customerlevelinfo> list);

	Integer insert(Customerlevelinfo customerlevelinfo);

	List<Customerlevelinfo> select(Map<String, String> map);

}
