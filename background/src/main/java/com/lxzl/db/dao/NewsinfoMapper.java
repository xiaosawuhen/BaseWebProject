package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Newsinfo;
import com.lxzl.db.transfor.bean.NewsBean;

public interface NewsinfoMapper {

	Integer insertBatch(List<Newsinfo> list);

	List<Newsinfo> select(Map<String, String> map);

	Integer insert(NewsBean newsBean);

	Integer updateById(NewsBean newsBean);

	Integer deleteById(@Param("nid")Long nid);

}
