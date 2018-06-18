package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Categoryinfo;
import com.lxzl.db.dao.CategoryinfoMapper;
import com.lxzl.db.service.CategoryinfoService;

@Service("categoryinfoService")
public class CategoryinfoServiceImpl implements CategoryinfoService {

	@Autowired
	CategoryinfoMapper categoryinfoMapper;

	@Transactional
	public Integer insertBatch(List<Categoryinfo> list) {
		return categoryinfoMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Categoryinfo categoryinfo) {
		return categoryinfoMapper.insert(categoryinfo);
	}

	@Transactional
	public List<Categoryinfo> select(Map<String, String> map) {
		return categoryinfoMapper.select(map);
	}

}
