package com.cn.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.db.bean.Projectemployeeinfo;
import com.cn.db.dao.ProjectemployeeinfoMapper;
import com.cn.service.ProjectemployeeinfoService;

@Service("projectemployeeinfoService")
public class ProjectemployeeinfoServiceImpl implements ProjectemployeeinfoService {

	@Autowired
	ProjectemployeeinfoMapper projectemployeeinfoMapper;

	@Transactional
	public Integer insertBatch(List<Projectemployeeinfo> list) {
		return projectemployeeinfoMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Projectemployeeinfo projectemployeeinfo) {
		return projectemployeeinfoMapper.insert(projectemployeeinfo);
	}

	@Transactional
	public List<Projectemployeeinfo> select(Map<String, String> map) {
		return projectemployeeinfoMapper.select(map);
	}

}
