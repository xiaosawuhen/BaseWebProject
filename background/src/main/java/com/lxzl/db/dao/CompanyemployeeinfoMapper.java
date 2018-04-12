package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Companyemployeeinfo;

public interface CompanyemployeeinfoMapper {

	Integer insertBatch(List<Companyemployeeinfo> list);

	Integer insert(Companyemployeeinfo companyemployeeinfo);

	List<Companyemployeeinfo> select(Map<String, String> map);

	Integer insertByEidCid(@Param("eid")Long eid, @Param("cid")Long cid);

}
