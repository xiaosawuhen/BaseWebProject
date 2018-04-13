package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Partners;
import com.lxzl.db.transfor.bean.PartnerBean;

public interface PartnersMapper {

	Integer insertBatch(List<Partners> list);

	List<Partners> select(Map<String, String> map);

	List<PartnerBean> selectByCnt(Map<String, Object> paramMap);

	Integer insert(PartnerBean partnerBean);

	PartnerBean selectById(@Param("pid")Integer pid);

	Integer updateById(PartnerBean partnerBean);

	Integer deleteById(@Param("pid")Long pid);

}
