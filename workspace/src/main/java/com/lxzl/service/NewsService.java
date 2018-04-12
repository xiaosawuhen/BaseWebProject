package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.News;
import com.lxzl.db.transfor.bean.NewsBean;

public interface NewsService {

	List<News> select(Map<String, String> map);

	List<NewsBean> selectByCnt(Map<String, Object> paramMap);

	NewsBean selectById(Integer nid);

	List<NewsBean> selectByCompanyId(Long cid);

}
