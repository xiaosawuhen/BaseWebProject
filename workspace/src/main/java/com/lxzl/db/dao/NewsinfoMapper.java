package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Newsinfo;

public interface NewsinfoMapper {

	List<Newsinfo> select(Map<String, String> map);

}
