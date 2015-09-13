package org.allen.springbeans;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBeans {
	
	private ApplicationContext applicationContext ;
	
	@Before
	public void prepare(){
		applicationContext = new ClassPathXmlApplicationContext("classpath*:/spring-config/spring-context.xml");
		
	}
	
	@Test
	public void test(){
		String contextName = applicationContext.getApplicationName();
		String displayName = applicationContext.getDisplayName();
		System.out.println("contextName:"+contextName);
		System.out.println("displayName:"+displayName);
	}
	
	
}
