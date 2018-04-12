package com.lxzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.News;
import com.lxzl.db.dao.NewsMapper;
import com.lxzl.db.transfor.bean.NewsBean;
import com.lxzl.service.NewsService;

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

	public List<NewsBean> selectByCnt(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer insert(NewsBean newsBean) {
		// TODO Auto-generated method stub
		return null;
	}

	public NewsBean selectById(Integer nid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer updateById(NewsBean newsBean) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer deleteById(Long nid) {
		// TODO Auto-generated method stub
		return null;
	}

}
