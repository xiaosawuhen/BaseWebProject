package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Productinfo;
import com.lxzl.db.dao.ProductinfoMapper;
import com.lxzl.db.service.ProductinfoService;

@Service("productinfoService")
public class ProductinfoServiceImpl implements ProductinfoService {

	@Autowired
	ProductinfoMapper productinfoMapper;

	@Transactional
	public Integer insertBatch(List<Productinfo> list) {
		return productinfoMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Productinfo productinfo) {
		return productinfoMapper.insert(productinfo);
	}

	@Transactional
	public List<Productinfo> select(Map<String, String> map) {
		return productinfoMapper.select(map);
	}

}
