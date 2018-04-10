package com.lxzl.ermaster.mybatis.factory;

import java.util.ArrayList;
import java.util.List;

import com.lxzl.ermaster.mybatis.bean.BeanPorperty;

/**
 * @author nannan.c.wang
 *
 */
public class DaoFactory {

	/**
	 * package com.cn.db.dao;
	 * 
	 * import java.util.List;
	 * import java.util.Map;
	 * 
	 * import com.cn.db.bean.User;
	 * 
	 * public interface UserMapper {
	 * 
	 * 	User selectPersion(Integer id);
	 * 
	 * 	Integer insertBatch(List<User> list);
	 * 	
	 * 	Integer insert(User user);
	 * 	
	 * 	List<User> select(Map<String, String> map);
	 * 
	 * }
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
		packageBuffer.append(".dao;");
		
		contentList.add(packageBuffer.toString());
		
		contentList.add("");
		contentList.add("import java.util.List;");
		contentList.add("import java.util.Map;");
		contentList.add("");
		contentList.add("import " + beanPackage.substring(0, beanPackage.length()) + "." + beanName + ";");

		contentList.add("");
		contentList.add("public interface " + beanName + "Mapper {");
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
}
