package com.lxzl.db.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Category;

public interface CategoryService {

	Integer insertBatch(List<Category> list);

	Integer insert(Category category);

	List<Category> select(Map<String, String> map);

}
