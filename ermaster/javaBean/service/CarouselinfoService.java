package com.lxzl.db.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Carouselinfo;

public interface CarouselinfoService {

	Integer insertBatch(List<Carouselinfo> list);

	Integer insert(Carouselinfo carouselinfo);

	List<Carouselinfo> select(Map<String, String> map);

}
