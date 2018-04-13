package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Partnerinfo;
import com.lxzl.db.dao.PartnerinfoMapper;
import com.lxzl.db.service.PartnerinfoService;

@Service("partnerinfoService")
public class PartnerinfoServiceImpl implements PartnerinfoService {

	@Autowired
	PartnerinfoMapper partnerinfoMapper;

	@Transactional
	public Integer insertBatch(List<Partnerinfo> list) {
		return partnerinfoMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Partnerinfo partnerinfo) {
		return partnerinfoMapper.insert(partnerinfo);
	}

	@Transactional
	public List<Partnerinfo> select(Map<String, String> map) {
		return partnerinfoMapper.select(map);
	}

}
