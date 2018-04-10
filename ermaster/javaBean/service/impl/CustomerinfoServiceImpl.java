package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Customerinfo;
import com.cn.db.dao.CustomerinfoMapper;
import com.cn.db.service.CustomerinfoService;

@Service("customerinfoService")
public class CustomerinfoServiceImpl implements CustomerinfoService {

	@Autowired
	CustomerinfoMapper customerinfoMapper;

	@Transactional
	public Integer insertBatch(List<Customerinfo> list) {
		return customerinfoMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Customerinfo customerinfo) {
		return customerinfoMapper.insert(customerinfo);
	}

	@Transactional
	public List<Customerinfo> select(Map<String, String> map) {
		return customerinfoMapper.select(map);
	}

}
