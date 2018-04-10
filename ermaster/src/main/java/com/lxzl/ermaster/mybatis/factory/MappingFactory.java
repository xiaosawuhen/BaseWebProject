package com.lxzl.ermaster.mybatis.factory;

import java.util.ArrayList;
import java.util.List;

import com.lxzl.ermaster.mybatis.bean.BeanPorperty;

/**
 * @author nannan.c.wang
 *
 */
public class MappingFactory {

	/**
	 * <?xml version="1.0" encoding="UTF-8"?>  
	 * <!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">  
	 *   
	 * <mapper namespace="com.cn.db.dao.UserMapper" >  
	 *     <select id="select" parameterType="map" resultType="com.cn.db.bean.User">  
	 *     </select>  
	 *     <insert id="insert" parameterType="com.cn.db.bean.User">
	 *     </insert>
	 *     <insert id="insertBatch" parameterType="list">
	 *     	INSERT INTO 
	 *     	USER(
	 * 			name,
	 * 			email
	 *     		)
 	 *    	VALUES
 	 *    	<foreach collection="list" item="item" separator=",">
	 *     		(
	 * 				#{item.name},
	 * 				#{item.email}
	 *     		)
	 *     	</foreach>
	 *     </insert>
	 * </mapper>  
	 * @param beanPorperty
	 * @return
	 */
	public List<String> create(BeanPorperty beanPorperty) {
		List<String> contentList = new ArrayList<String>();
		String beanPackage = beanPorperty.get_package();
		String beanName = beanPorperty.getName();
		String beanNamePath = beanPackage.substring(0, beanPackage.length()) + "." + beanName;

		StringBuffer mapperNameBuffer = new StringBuffer();
		String _package = beanPackage.substring(0, beanPackage.lastIndexOf("."));
		mapperNameBuffer.append(_package);
		mapperNameBuffer.append(".dao.");
		mapperNameBuffer.append(beanName);
		mapperNameBuffer.append("Mapper");
		
		contentList.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		contentList.add("<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">");
		contentList.add("<mapper namespace=\""+mapperNameBuffer.toString()+"\" >");
		contentList.add("\t<select id=\"select\" parameterType=\"map\" resultType=\""+beanNamePath+"\">  ");
		contentList.add("\t</select>");
		contentList.add("\t<insert id=\"insert\" parameterType=\""+beanNamePath+"\">");
		contentList.add("\t</insert>");
		contentList.add("\t<insert id=\"insertBatch\" parameterType=\"list\">");
		contentList.add("\t\tINSERT INTO");
		contentList.add("\t\t\tUSER(");
		contentList.add("\t\t\tname,");
		contentList.add("\t\t\temail");
		contentList.add("\t\t)");
		contentList.add("\t\tVALUES");
		contentList.add("\t\t<foreach collection=\"list\" item=\"item\" separator=\",\">");
		contentList.add("\t\t\t(");
		contentList.add("\t\t\t\t#{item.name},");
		contentList.add("\t\t\t\t#{item.email}");
		contentList.add("\t\t\t)");
		contentList.add("\t\t</foreach>");
		contentList.add("\t</insert>");
		contentList.add("</mapper>");
		contentList.add("");
		return contentList;
	}
}
