package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Credential;
import com.lxzl.db.transfor.bean.CredentialBean;

public interface CredentialMapper {

	Integer insertBatch(List<Credential> list);

	List<Credential> select(Map<String, String> map);

	List<CredentialBean> selectByCnt(Map<String, Object> map);

	Integer insert(CredentialBean credentialBean);

	CredentialBean selectById(@Param("crid")Long crid);

	Integer updateById(CredentialBean credentialBean);

	Integer deleteById(@Param("crid")Integer crid);

}
