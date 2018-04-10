package com.cn.db.dao;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Customerinfo;

public interface CustomerinfoMapper {

	Integer insertBatch(List<Customerinfo> list);

	Integer insert(Customerinfo customerinfo);

	List<Customerinfo> select(Map<String, String> map);

}
