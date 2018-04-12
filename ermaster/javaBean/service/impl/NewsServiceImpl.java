package com.lxzl.db.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.News;
import com.lxzl.db.dao.NewsMapper;
import com.lxzl.db.service.NewsService;

@Service("newsService")
public class NewsServiceImpl implements NewsService {

	@Autowired
	NewsMapper newsMapper;

	@Transactional
	public Integer insertBatch(List<News> list) {
		return newsMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(News news) {
		return newsMapper.insert(news);
	}

	@Transactional
	public List<News> select(Map<String, String> map) {
		return newsMapper.select(map);
	}

}
