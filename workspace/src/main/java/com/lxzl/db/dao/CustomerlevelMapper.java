package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customerlevel;

public interface CustomerlevelMapper {

	List<Customerlevel> select(Map<String, String> map);

}
