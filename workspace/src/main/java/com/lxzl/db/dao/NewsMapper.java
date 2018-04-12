package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.News;

public interface NewsMapper {

	Integer insertBatch(List<News> list);

	Integer insert(News news);

	List<News> select(Map<String, String> map);

}
