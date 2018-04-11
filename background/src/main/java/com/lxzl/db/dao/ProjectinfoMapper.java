package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Projectinfo;
import com.lxzl.db.transfor.bean.ProjectBean;

public interface ProjectinfoMapper {

	Integer insertBatch(List<ProjectBean> list);

	Integer insert(ProjectBean projectBean);

	List<Projectinfo> select(Map<String, String> map);

	Integer updateById(ProjectBean projectBean);

	Integer deleteById(@Param("pid")Long pid);

}
