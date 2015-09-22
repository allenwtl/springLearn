package org.allen.springbeans.bean;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
	
	public TestBean() {
		System.out.println("bean Init");
	}
	
	private String name ;
	
	@Resource
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
