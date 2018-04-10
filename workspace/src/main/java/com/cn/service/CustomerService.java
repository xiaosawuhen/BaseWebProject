package com.cn.service;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Customer;

public interface CustomerService {

	Integer insertBatch(List<Customer> list);

	Integer insert(Customer customer);

	List<Customer> select(Map<String, String> map);

}
