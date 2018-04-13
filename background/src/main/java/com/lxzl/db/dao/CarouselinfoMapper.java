package com.lxzl.db.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lxzl.db.bean.Carouselinfo;
import com.lxzl.db.transfor.bean.CarouselBean;

public interface CarouselinfoMapper {

	Integer insertBatch(List<Carouselinfo> list);

	List<Carouselinfo> select(Map<String, String> map);

	Integer insert(CarouselBean carouselBean);

	Integer updateById(CarouselBean carouselBean);

	Integer deleteById(@Param("caid")Long caid);

}
