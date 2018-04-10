package com.cn.thread;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cn.controller.SpringBeanFactory;
import com.cn.db.bean.User;
import com.cn.db.dao.UserMapper;

@Component
public class UserInsertThread implements Runnable {
	
	private List<User> list;
	private CountDownLatch latch;
	
	public UserInsertThread(CountDownLatch latch, List<User> list) {
		this.latch = latch;
		this.list = list;
	}

	public void run() {
		insert();
	}
	
//	@Transactional(propagation = Propagation.NESTED)
	@Transactional
	public void insert() {
		UserMapper userMapper1 = SpringBeanFactory.getBean(UserMapper.class);
		userMapper1.insertBatch(list);
		this.latch.countDown();
	}
}
