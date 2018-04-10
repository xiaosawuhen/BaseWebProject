package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customercompanyinfo;

public interface CustomercompanyinfoMapper {

	Integer insertBatch(List<Customercompanyinfo> list);

	Integer insert(Customercompanyinfo customercompanyinfo);

	List<Customercompanyinfo> select(Map<String, String> map);

}
