package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Services;
import com.lxzl.db.transfor.bean.ServicesBean;

public interface ServicesService {

	List<Services> select(Map<String, String> map);

	List<ServicesBean> selectByCnt(Map<String, Object> paramMap);

	ServicesBean selectById(Integer sid);

	List<ServicesBean> selectByCompanyId(Long cid);

}
