package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Project;
import com.lxzl.db.transfor.bean.ProjectBean;

public interface ProjectMapper {

	Integer insertBatch(List<ProjectBean> list);

	Integer insert(ProjectBean projectBean);

	List<Project> select(Map<String, String> map);

	List<ProjectBean> selectByCnt(Map<String, Object> paramMap);

	ProjectBean selectById(@Param("pid")Integer pid);

	Integer updateById(ProjectBean projectBean);

	Integer deleteById(@Param("pid")Long pid);

}
