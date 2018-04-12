package com.lxzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Credential;
import com.lxzl.db.dao.CredentialMapper;
import com.lxzl.db.transfor.bean.CredentialBean;
import com.lxzl.service.CredentialService;

@Service("credentialService")
public class CredentialServiceImpl implements CredentialService {

	@Autowired
	CredentialMapper credentialMapper;

	@Transactional
	public List<Credential> select(Map<String, String> map) {
		return credentialMapper.select(map);
	}

	public List<CredentialBean> selectByCnt(Map<String, Object> paramMap) {
		return credentialMapper.selectByCnt(paramMap);
	}

	public CredentialBean selectById(Long crid) {
		return credentialMapper.selectById(crid);
	}

	public List<CredentialBean> selectByCompanyId(Long cid) {
		return credentialMapper.selectByCompanyId(cid);
	}

}
