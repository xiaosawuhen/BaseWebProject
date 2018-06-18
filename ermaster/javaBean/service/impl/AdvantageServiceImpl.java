package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Advantage;
import com.lxzl.db.dao.AdvantageMapper;
import com.lxzl.db.service.AdvantageService;

@Service("advantageService")
public class AdvantageServiceImpl implements AdvantageService {

	@Autowired
	AdvantageMapper advantageMapper;

	@Transactional
	public Integer insertBatch(List<Advantage> list) {
		return advantageMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Advantage advantage) {
		return advantageMapper.insert(advantage);
	}

	@Transactional
	public List<Advantage> select(Map<String, String> map) {
		return advantageMapper.select(map);
	}

}
