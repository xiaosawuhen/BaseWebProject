package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Projectinfo;
import com.lxzl.db.dao.ProjectinfoMapper;
import com.lxzl.service.ProjectinfoService;

@Service("projectinfoService")
public class ProjectinfoServiceImpl implements ProjectinfoService {

	@Autowired
	ProjectinfoMapper projectinfoMapper;

	@Transactional
	public List<Projectinfo> select(Map<String, String> map) {
		return projectinfoMapper.select(map);
	}

}
