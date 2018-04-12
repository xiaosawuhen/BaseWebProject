package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Project;
import com.lxzl.db.transfor.bean.ProjectBean;

public interface ProjectService {

	List<Project> select(Map<String, String> map);

	List<ProjectBean> selectByCompanyId(Long cid);

}
