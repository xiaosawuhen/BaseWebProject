package com.lxzl.ermaster.mybatis.factory;

import java.util.ArrayList;
import java.util.List;

import com.lxzl.ermaster.mybatis.bean.BeanPorperty;

/**
 * @author nannan.c.wang
 *
 */
public class ServiceFactory {

	
	/**
	 * package com.cn.service;
	 * 
	 * import java.util.List;
	 * import com.cn.db.bean.User;
	 * 
	 * public interface UserService{
	 * 	Integer insertBatch(List<User> list);
	 * 	Integer insert(User user);
	 * 	List<User> select(Map<String, String> map);
	 * }
	 * 
	 * @param beanPorperty
	 * @return
	 */
	public List<String> create(BeanPorperty beanPorperty) {
		List<String> contentList = new ArrayList<String>();
		String beanPackage = beanPorperty.get_package();
		String beanName = beanPorperty.getName();
		
		StringBuffer packageBuffer = new StringBuffer();
		packageBuffer.append("package ");
		String _package = beanPackage.substring(0, beanPackage.lastIndexOf("."));
		packageBuffer.append(_package);
		packageBuffer.append(".service;");
		
		contentList.add(packageBuffer.toString());
		
		contentList.add("");
		contentList.add("import java.util.List;");
		contentList.add("import java.util.Map;");
		contentList.add("");
		contentList.add("import " + beanPackage.substring(0, beanPackage.length()) + "." + beanName + ";");

		contentList.add("");
		contentList.add("public interface " + beanName + "Service {");
		contentList.add("");
		contentList.add("\tInteger insertBatch(List<"+beanName+"> list);");
		contentList.add("");
		contentList.add("\tInteger insert("+ beanName +" "+beanName.toLowerCase()+");");
		contentList.add("");
		contentList.add("\tList<"+beanName+"> select(Map<String, String> map);");
		contentList.add("");
		contentList.add("}");
		
		return contentList;
	}
	
	/**
	 * package com.cn.service.impl;
	 * 
	 * import java.util.List;
	 * import java.util.concurrent.CountDownLatch;
	 * 
	 * import org.springframework.beans.factory.annotation.Autowired;
	 * import org.springframework.stereotype.Service;
	 * import org.springframework.transaction.annotation.Transactional;
	 * 
	 * import com.cn.db.bean.User;
	 * import com.cn.db.dao.UserMapper;
	 * import com.cn.service.UserService;
	 * 
	 * @Service("useService")
	 * public class DefaultUserService implements UserService{
	 * 	
	 * 	@Autowired
	 * 	UserMapper userMapper;
	 * 
	 * 	@Transactional
	 * 	public Integer insertBatch(List<User> list) {
	 * 		
	 * 	}
	 * }
	 * @param beanPorperty
	 * @return
	 */
	public List<String> createImpl(BeanPorperty beanPorperty) {
		List<String> contentList = new ArrayList<String>();
		String beanPackage = beanPorperty.get_package();
		String beanName = beanPorperty.getName();
		
		StringBuffer packageBuffer = new StringBuffer();
		packageBuffer.append("package ");
		String _package = beanPackage.substring(0, beanPackage.lastIndexOf("."));
		packageBuffer.append(_package);
		packageBuffer.append(".service.impl;");
		
		contentList.add(packageBuffer.toString());

		contentList.add("");
		contentList.add("import java.util.List;");
		contentList.add("import java.util.concurrent.CountDownLatch;");
		contentList.add("import java.util.Map;");
		contentList.add("");
		contentList.add("import org.springframework.beans.factory.annotation.Autowired;");
		contentList.add("import org.springframework.stereotype.Service;");
		contentList.add("import org.springframework.transaction.annotation.Transactional;");
		contentList.add("");
		contentList.add("import " + beanPackage.substring(0, beanPackage.length()) + "." + beanName + ";");
		contentList.add("import " + _package + ".dao." + beanName + "Mapper;");
		contentList.add("import " + _package + ".service." + beanName + "Service;");
		contentList.add("");
		contentList.add("@Service(\""+beanName.toLowerCase()+"Service\")");
		contentList.add("public class "+beanName+"ServiceImpl implements "+beanName+"Service {");
		contentList.add("");
		contentList.add("\t@Autowired");
		contentList.add("\t" + beanName+"Mapper "+beanName.toLowerCase()+"Mapper;");
		contentList.add("");
		contentList.add("\t@Transactional");
		contentList.add("\tpublic Integer insertBatch(List<"+beanName+"> list) {");
		contentList.add("\t\treturn "+beanName.toLowerCase()+"Mapper.insertBatch(list);");
		contentList.add("\t}");
		contentList.add("");
		contentList.add("\t@Transactional");
		contentList.add("\tpublic Integer insert("+ beanName +" "+beanName.toLowerCase()+") {");
		contentList.add("\t\treturn "+beanName.toLowerCase()+"Mapper.insert("+beanName.toLowerCase()+");");
		contentList.add("\t}");
		contentList.add("");
		contentList.add("\t@Transactional");
		contentList.add("\tpublic List<"+beanName+"> select(Map<String, String> map) {");
		contentList.add("\t\treturn "+beanName.toLowerCase()+"Mapper.select(map);");
		contentList.add("\t}");
		contentList.add("");
		contentList.add("}");
		
		return contentList;
	}
}
