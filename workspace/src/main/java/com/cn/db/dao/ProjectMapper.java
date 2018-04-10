package com.cn.db.dao;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Project;

public interface ProjectMapper {

	Integer insertBatch(List<Project> list);

	Integer insert(Project project);

	List<Project> select(Map<String, String> map);

}
