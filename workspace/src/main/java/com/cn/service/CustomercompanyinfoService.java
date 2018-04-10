package com.cn.service;

import java.util.List;
import java.util.Map;

import com.cn.db.bean.Customercompanyinfo;

public interface CustomercompanyinfoService {

	Integer insertBatch(List<Customercompanyinfo> list);

	Integer insert(Customercompanyinfo customercompanyinfo);

	List<Customercompanyinfo> select(Map<String, String> map);

}
