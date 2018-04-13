package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Carousel;

public interface CarouselService {

	Integer insertBatch(List<Carousel> list);

	Integer insert(Carousel carousel);

	List<Carousel> select(Map<String, String> map);

}
