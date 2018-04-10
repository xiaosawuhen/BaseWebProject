package com.lxzl.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Project;
import com.lxzl.db.dao.ProjectMapper;
import com.lxzl.service.ProjectService;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectMapper projectMapper;

	@Transactional
	public Integer insertBatch(List<Project> list) {
		return projectMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Project project) {
		return projectMapper.insert(project);
	}

	@Transactional
	public List<Project> select(Map<String, String> map) {
		return projectMapper.select(map);
	}

}
