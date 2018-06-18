package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Category;

public interface CategoryMapper {

	Integer insertBatch(List<Category> list);

	Integer insert(Category category);

	List<Category> select(Map<String, String> map);

}
