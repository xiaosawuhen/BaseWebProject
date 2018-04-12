package com.lxzl.service;

import java.util.List;
import java.util.Map;

import com.lxzl.db.bean.Customercompanyinfo;

public interface CustomercompanyinfoService {

	List<Customercompanyinfo> select(Map<String, String> map);

}
