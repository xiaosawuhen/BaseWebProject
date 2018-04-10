package com.lxzl.ermaster;

import java.io.File;

import com.lxzl.ermaster.mybatis.MybatisFactoryBean;

/**
 * @author nannan.c.wang
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MybatisFactoryBean mybatisFactoryBean = new MybatisFactoryBean();
    	
    	mybatisFactoryBean.createBean();
    }
}
