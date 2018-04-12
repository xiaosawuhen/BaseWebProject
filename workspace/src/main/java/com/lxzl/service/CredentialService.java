package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Credential;
import com.lxzl.db.transfor.bean.CredentialBean;

public interface CredentialService {

	List<Credential> select(Map<String, String> map);

	List<CredentialBean> selectByCnt(Map<String, Object> paramMap);

	CredentialBean selectById(Long crid);

	List<CredentialBean> selectByCompanyId(Long cid);
}
