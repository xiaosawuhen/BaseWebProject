package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Services;
import com.lxzl.db.transfor.bean.ServicesBean;

public interface ServicesMapper {

	Integer insertBatch(List<Services> list);

	List<Services> select(Map<String, String> map);

	List<ServicesBean> selectByCnt(Map<String, Object> paramMap);

	Integer insert(ServicesBean servicesBean);

	ServicesBean selectById(@Param("sid")Integer sid);

	Integer updateById(ServicesBean servicesBean);

	Integer deleteById(@Param("sid")Long sid);

}
