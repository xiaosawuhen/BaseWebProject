package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Project;
import com.lxzl.db.dao.ProjectMapper;
import com.lxzl.db.transfor.bean.ProjectBean;
import com.lxzl.service.ProjectService;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectMapper projectMapper;

	@Transactional
	public List<Project> select(Map<String, String> map) {
		return projectMapper.select(map);
	}

	public List<ProjectBean> selectByCompanyId(Long cid) {
		return projectMapper.selectByCompanyId(cid);
	}

}
