package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Customerinfo;

public interface CustomerinfoMapper {

	List<Customerinfo> select(Map<String, String> map);

	Customerinfo selectByAliasName(@Param("aliasName")String aliasName);
}
