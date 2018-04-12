package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customercompanyinfo;

public interface CustomercompanyinfoMapper {

	List<Customercompanyinfo> select(Map<String, String> map);

}
