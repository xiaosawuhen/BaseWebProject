package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Carousel;

public interface CarouselMapper {

	Integer insertBatch(List<Carousel> list);

	Integer insert(Carousel carousel);

	List<Carousel> select(Map<String, String> map);

}
