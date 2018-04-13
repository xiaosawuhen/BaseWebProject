package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Partnerinfo;
import com.lxzl.db.transfor.bean.PartnerBean;

public interface PartnerinfoMapper {

	Integer insertBatch(List<Partnerinfo> list);

	List<Partnerinfo> select(Map<String, String> map);

	Integer insert(PartnerBean partnerBean);

	Integer updateById(PartnerBean partnerBean);

	Integer deleteById(@Param("pid")Long pid);

}
