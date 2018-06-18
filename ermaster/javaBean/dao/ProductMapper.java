package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Product;

public interface ProductMapper {

	Integer insertBatch(List<Product> list);

	Integer insert(Product product);

	List<Product> select(Map<String, String> map);

}
