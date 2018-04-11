package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Credential;

public interface CredentialMapper {

	Integer insertBatch(List<Credential> list);

	Integer insert(Credential credential);

	List<Credential> select(Map<String, String> map);

}
