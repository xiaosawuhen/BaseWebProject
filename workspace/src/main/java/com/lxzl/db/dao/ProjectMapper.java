package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Project;
import com.lxzl.db.transfor.bean.ProjectBean;

public interface ProjectMapper {

	List<Project> select(Map<String, String> map);

	List<ProjectBean> selectByCompanyId(@Param("cid")Long cid);

}
