package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customerlevel;

public interface CustomerlevelService {

	List<Customerlevel> select(Map<String, String> map);

}
