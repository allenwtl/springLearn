package org.allen.springbeans;

import org.allen.springbeans.annotation.AppConfig;
import org.allen.springbeans.bean.Animal;
import org.allen.springbeans.bean.TestBean;
import org.allen.springbeans.service.Caculater;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBeans {
	
	private ApplicationContext applicationContext ;
	
	@Before
	public void prepare(){
		//xml-base spring container Configuration
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config/spring-context.xml");
		
		
		// java-base spring container Configuration
		//applicationContext =  new AnnotationConfigApplicationContext(AppConfig.class);
		
	}
	
	@Test
	public void test(){
		String contextName = applicationContext.getApplicationName();
		String displayName = applicationContext.getDisplayName();
		System.out.println("contextName:"+contextName);
		System.out.println("displayName:"+displayName);
		
		String [] beanDeCount = applicationContext.getBeanDefinitionNames();
		for (String string : beanDeCount) {
			Object beanDe = applicationContext.getBean(string, Object.class);
			System.out.println(string+":"+ beanDe);
		}
		
		TestBean testBean  = applicationContext.getBean(TestBean.class);
		System.out.println(testBean.getName());
		
		Animal animal  = applicationContext.getBean(Animal.class);
		System.out.println(animal.toString());
	
		/*System.out.println(applicationContext.getBean("staticFactoryBean").toString());*/
		
		System.out.println(applicationContext.getBean("colorBean"));
		
	/*	Caculater caculater = applicationContext.getBean(Caculater.class);
		caculater.add();*/
	}

	
	@Test
	public void test2(){
		//java-base spring container Configuration
		AnnotationConfigApplicationContext appContext  =  new AnnotationConfigApplicationContext();
		appContext.register(AppConfig.class);
		appContext.refresh();
		
		String [] beanDeCount = appContext.getBeanDefinitionNames();
		for (String string : beanDeCount) {
			Object beanDe = appContext.getBean(string, Object.class);
			System.out.println(string+":"+ beanDe);
		}
		
		Caculater caculater = appContext.getBean(Caculater.class);
		caculater.add();
	}
	
	
	@Test
	public void test3(){
		//org.allen.springbeans.bean
		AnnotationConfigApplicationContext appContext  =  new AnnotationConfigApplicationContext();
		appContext.scan("org.allen.springbeans.bean");
		appContext.refresh();
		
		String [] beanDeCount = appContext.getBeanDefinitionNames();
		for (String string : beanDeCount) {
			Object beanDe = appContext.getBean(string, Object.class);
			System.out.println(string+":"+ beanDe);
		}
	}
	 
}
