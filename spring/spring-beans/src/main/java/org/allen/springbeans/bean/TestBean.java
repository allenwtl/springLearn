package org.allen.springbeans.bean;


public class TestBean {
	
	public TestBean() {
		System.out.println("bean Init");
	}
	private String name ;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
