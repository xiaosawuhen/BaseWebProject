package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Services;
import com.lxzl.db.transfor.bean.ServicesBean;

public interface ServicesMapper {

	List<Services> select(Map<String, String> map);

	List<ServicesBean> selectByCompanyId(@Param("cid")Long cid);

}
