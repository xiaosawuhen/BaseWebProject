package com.lxzl.ermaster.mybatis.analyze;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.lxzl.ermaster.mybatis.bean.BeanPorperty;
import com.lxzl.ermaster.mybatis.write.Reader;

/**
 * @author nannan.c.wang
 *
 */
public class BeanAnalyz {

	public BeanPorperty analyz(File beanFile) {
		BeanPorperty porperty = new BeanPorperty();
		
		Reader reader = new Reader();
		List<String> contentList = reader.readFile(beanFile);
		for (String content : contentList) {
			content = content.trim();
			
			if(content.startsWith("package")) {
				String _package = content.split(" ")[1].replaceAll(";", "");
				porperty.set_package(_package);
			}
			
			if(content.startsWith("public") && content.contains(" class ")) {
				String name = content.split(" ")[2].replaceAll("}", "");
				porperty.setName(name);
			}
		}
		
		return porperty;
	}
	
	public List<BeanPorperty> analyzAll(List<File> beanFileList) {
		List<BeanPorperty> porpertyList = new ArrayList<BeanPorperty>();
		
		for (File file : beanFileList) {
			BeanPorperty porperty = analyz(file);
			porpertyList.add(porperty);
		}
		
		return porpertyList;
	}
}
