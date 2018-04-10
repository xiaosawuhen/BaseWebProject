package com.lxzl.ermaster.mybatis;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.lxzl.ermaster.mybatis.analyze.BeanAnalyz;
import com.lxzl.ermaster.mybatis.bean.BeanPorperty;
import com.lxzl.ermaster.mybatis.factory.DaoFactory;
import com.lxzl.ermaster.mybatis.factory.MappingFactory;
import com.lxzl.ermaster.mybatis.factory.ServiceFactory;
import com.lxzl.ermaster.mybatis.write.Writter;

/**
 * @author nannan.c.wang
 *
 */
public class MybatisFactoryBean {
	
	public void createBean() {

		String basePath = "javaBean";
		
		// 取得所有的文件
		File baseDic = new File(basePath);
		List<File> fileList = getFileList(baseDic);
		
		// 分析文件属性
		BeanAnalyz beanAnalyz = new BeanAnalyz();
		List<BeanPorperty> porperties = beanAnalyz.analyzAll(fileList);

		ServiceFactory serviceFactory = new ServiceFactory();
		MappingFactory mappingFactory = new MappingFactory();
		DaoFactory daoFactory = new DaoFactory();
		Writter writter = new Writter();
		
		// 生成文件
		for (BeanPorperty beanPorperty : porperties) {
			
			List<String> serviceContentList = serviceFactory.create(beanPorperty);
			List<String> serviceImplContentList = serviceFactory.createImpl(beanPorperty);
			List<String> mappingContentList = mappingFactory.create(beanPorperty);
			List<String> daoContentList = daoFactory.create(beanPorperty);
			
			writter.write(new File(basePath + File.separator + "service"), beanPorperty.getName() + "Service.java", serviceContentList);
			writter.write(new File(basePath + File.separator + "service" + File.separator + "impl"), beanPorperty.getName() + "ServiceImpl.java", serviceImplContentList);
			writter.write(new File(basePath + File.separator + "mapping"), beanPorperty.getName() + ".xml", mappingContentList);
			writter.write(new File(basePath + File.separator + "dao"), beanPorperty.getName() + "Mapper.java", daoContentList);
		}
	}
	
	public List<File> getFileList(File file) {
		List<File> fileList = new ArrayList<File>();

		File[] subFiles = file.listFiles();
		
		for (File subFile : subFiles) {
			if(subFile.isFile()){
				fileList.add(subFile);
			} else if(subFile.isDirectory()) {
//				fileList.addAll(getFileList(subFile));
			}
		}
		
		return fileList;
	}
}
