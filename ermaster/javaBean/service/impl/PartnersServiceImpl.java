package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Partners;
import com.lxzl.db.dao.PartnersMapper;
import com.lxzl.db.service.PartnersService;

@Service("partnersService")
public class PartnersServiceImpl implements PartnersService {

	@Autowired
	PartnersMapper partnersMapper;

	@Transactional
	public Integer insertBatch(List<Partners> list) {
		return partnersMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Partners partners) {
		return partnersMapper.insert(partners);
	}

	@Transactional
	public List<Partners> select(Map<String, String> map) {
		return partnersMapper.select(map);
	}

}
