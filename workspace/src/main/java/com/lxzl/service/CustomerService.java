package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customer;

public interface CustomerService {

	List<Customer> select(Map<String, String> map);

}
