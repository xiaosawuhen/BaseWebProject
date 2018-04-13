package com.lxzl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxzl.db.bean.Carousel;
import com.lxzl.db.dao.CarouselMapper;
import com.lxzl.service.CarouselService;

@Service("carouselService")
public class CarouselServiceImpl implements CarouselService {

	@Autowired
	CarouselMapper carouselMapper;

	@Transactional
	public Integer insertBatch(List<Carousel> list) {
		return carouselMapper.insertBatch(list);
	}

	@Transactional
	public Integer insert(Carousel carousel) {
		return carouselMapper.insert(carousel);
	}

	@Transactional
	public List<Carousel> select(Map<String, String> map) {
		return carouselMapper.select(map);
	}

}
