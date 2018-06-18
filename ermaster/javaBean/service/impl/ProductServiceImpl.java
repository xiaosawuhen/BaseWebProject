package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Product;
import com.lxzl.db.dao.ProductMapper;
import com.lxzl.db.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductMapper productMapper;

	@Transactional
	public Integer insertBatch(List<Product> list) {
		return productMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Product product) {
		return productMapper.insert(product);
	}

	@Transactional
	public List<Product> select(Map<String, String> map) {
		return productMapper.select(map);
	}

}
