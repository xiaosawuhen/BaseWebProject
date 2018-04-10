package com.cn.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Customerlevelinfo;
import com.cn.db.dao.CustomerlevelinfoMapper;
import com.cn.service.CustomerlevelinfoService;

@Service("customerlevelinfoService")
public class CustomerlevelinfoServiceImpl implements CustomerlevelinfoService {

	@Autowired
	CustomerlevelinfoMapper customerlevelinfoMapper;

	@Transactional
	public Integer insertBatch(List<Customerlevelinfo> list) {
		return customerlevelinfoMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Customerlevelinfo customerlevelinfo) {
		return customerlevelinfoMapper.insert(customerlevelinfo);
	}

	@Transactional
	public List<Customerlevelinfo> select(Map<String, String> map) {
		return customerlevelinfoMapper.select(map);
	}

}
