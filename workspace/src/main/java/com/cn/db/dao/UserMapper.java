package com.cn.db.dao;

import java.util.List;

import com.cn.db.bean.User;

public interface UserMapper {

	User selectPersion(Integer id);
	
	Integer insertBatch(List<User> list);
}
