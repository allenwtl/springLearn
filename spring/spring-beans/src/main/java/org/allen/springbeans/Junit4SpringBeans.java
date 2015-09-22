package org.allen.springbeans;

import javax.annotation.Resource;

import org.allen.springbeans.bean.TestBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Junit4SpringBeans extends BaseTest{

	@Resource
	private String name ;
	
	@Autowired
	private TestBean testBean;
	
	@Test
	public void test(){
		System.out.println("name:"+name);
		System.out.println("testBean.name:"+testBean.getName());
	}
}
