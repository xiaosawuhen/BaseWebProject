package com.cn.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Projectinfo;
import com.cn.db.dao.ProjectinfoMapper;
import com.cn.db.service.ProjectinfoService;

@Service("projectinfoService")
public class ProjectinfoServiceImpl implements ProjectinfoService {

	@Autowired
	ProjectinfoMapper projectinfoMapper;

	@Transactional
	public Integer insertBatch(List<Projectinfo> list) {
		return projectinfoMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Projectinfo projectinfo) {
		return projectinfoMapper.insert(projectinfo);
	}

	@Transactional
	public List<Projectinfo> select(Map<String, String> map) {
		return projectinfoMapper.select(map);
	}

}
