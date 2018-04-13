package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.News;
import com.lxzl.db.transfor.bean.NewsBean;

public interface NewsMapper {

	Integer insertBatch(List<News> list);

	List<News> select(Map<String, String> map);

	List<NewsBean> selectByCnt(Map<String, Object> paramMap);

	Integer insert(NewsBean newsBean);

	NewsBean selectById(@Param("nid")Integer nid);

	Integer updateById(NewsBean newsBean);

	Integer deleteById(@Param("nid")Long nid);

}
