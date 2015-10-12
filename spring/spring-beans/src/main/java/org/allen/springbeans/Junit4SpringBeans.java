package org.allen.springbeans;

import javax.annotation.Resource;

import org.allen.springbeans.bean.Color;
import org.allen.springbeans.bean.MyFactoryBean;
import org.allen.springbeans.bean.TestBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Junit4SpringBeans extends BaseTest{

	@Resource
	private String name ;
	
	@Resource
	private TestBean testBean;
	
	@Autowired
	private MyFactoryBean myFactoryBean ;
	
	@Autowired
	private Color color ;
	
	@Test
	public void junitTest(){
		System.out.println("name:"+name);
		System.out.println("testBean.name:"+testBean.getName());
//		System.out.println(myFactoryBean.createInstance());
		System.out.println(color);
	}
}
