package com.cn.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.controller.SpringBeanFactory;
import com.cn.db.bean.User;
import com.cn.db.dao.UserMapper;
import com.cn.service.UserService;
import com.cn.thread.UserInsertThread;

@Service("useService")
public class DefaultUserService implements UserService{
	
	@Autowired
	UserMapper userMapper;

	@Transactional
	public Integer insertBatch(List<User> list) {
		
		int cnt = list.size();
		
		int threadCnt = cnt / 500;
		
		if(cnt%500 > 0) {
			threadCnt++;
		}

		final CountDownLatch cdl= new CountDownLatch(threadCnt);
		List<User> threadList = null;
		
		for (int i = 0; i < threadCnt; i++) {
			threadList = i == threadCnt-1 ? list.subList(i * 500, list.size()-1) : list.subList(i*500, (i+1)*500);
			new Thread(new UserInsertThread(cdl, threadList)).start();
		}
		
		try {
			cdl.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
}
