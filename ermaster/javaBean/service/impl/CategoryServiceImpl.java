package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Category;
import com.lxzl.db.dao.CategoryMapper;
import com.lxzl.db.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryMapper categoryMapper;

	@Transactional
	public Integer insertBatch(List<Category> list) {
		return categoryMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Category category) {
		return categoryMapper.insert(category);
	}

	@Transactional
	public List<Category> select(Map<String, String> map) {
		return categoryMapper.select(map);
	}

}
