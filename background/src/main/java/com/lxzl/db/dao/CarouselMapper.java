package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Carousel;
import com.lxzl.db.transfor.bean.CarouselBean;

public interface CarouselMapper {

	Integer insertBatch(List<Carousel> list);

	List<Carousel> select(Map<String, String> map);

	List<CarouselBean> selectByCnt(Map<String, Object> paramMap);

	Integer insert(CarouselBean carouselBean);

	CarouselBean selectById(@Param("caid")Integer caid);

	Integer updateById(CarouselBean carouselBean);

	Integer deleteById(@Param("caid")Long caid);

}
