package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Project;

public interface ProjectService {

	Integer insertBatch(List<Project> list);

	Integer insert(Project project);

	List<Project> select(Map<String, String> map);

}