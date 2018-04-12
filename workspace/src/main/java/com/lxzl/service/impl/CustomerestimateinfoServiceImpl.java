package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Customerestimateinfo;
import com.lxzl.db.dao.CustomerestimateinfoMapper;
import com.lxzl.service.CustomerestimateinfoService;

@Service("customerestimateinfoService")
public class CustomerestimateinfoServiceImpl implements CustomerestimateinfoService {

	@Autowired
	CustomerestimateinfoMapper customerestimateinfoMapper;

	@Transactional
	public List<Customerestimateinfo> select(Map<String, String> map) {
		return customerestimateinfoMapper.select(map);
	}

}
