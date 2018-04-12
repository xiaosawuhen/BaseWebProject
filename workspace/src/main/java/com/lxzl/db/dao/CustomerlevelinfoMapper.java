package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customerlevelinfo;

public interface CustomerlevelinfoMapper {

	List<Customerlevelinfo> select(Map<String, String> map);

}
