package com.lxzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Credential;
import com.lxzl.db.dao.CredentialMapper;
import com.lxzl.service.CredentialService;

@Service("credentialService")
public class CredentialServiceImpl implements CredentialService {

	@Autowired
	CredentialMapper credentialMapper;

	@Transactional
	public Integer insertBatch(List<Credential> list) {
		return credentialMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Credential credential) {
		return credentialMapper.insert(credential);
	}

	@Transactional
	public List<Credential> select(Map<String, String> map) {
		return credentialMapper.select(map);
	}

}
