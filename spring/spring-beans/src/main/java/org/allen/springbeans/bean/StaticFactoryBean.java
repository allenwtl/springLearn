package org.allen.springbeans.bean;

import java.util.Random;

public class StaticFactoryBean {
	
	public static Integer getRandom(){
		return (new Random().nextInt(10));
	}
}
