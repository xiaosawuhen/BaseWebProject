package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.News;
import com.lxzl.db.transfor.bean.NewsBean;

public interface NewsMapper {

	List<News> select(Map<String, String> map);

	List<NewsBean> selectByCompanyId(@Param("cid")Long cid);

}
