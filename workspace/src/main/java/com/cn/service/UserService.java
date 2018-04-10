package com.cn.service;

import java.util.List;

import com.cn.db.bean.User;

public interface UserService{
	
	Integer insertBatch(List<User> list);
}
