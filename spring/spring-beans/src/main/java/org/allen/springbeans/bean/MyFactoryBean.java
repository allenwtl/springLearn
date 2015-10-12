package org.allen.springbeans.bean;

public class MyFactoryBean {
	
	public void init(){
		System.out.println(" myFactory init invoked");
	}
	
	public Color createInstance(){
		Color color = new Color();
		color.setDiwen("yellow");
		color.setMianwen("nimei");
		return color ;
	}
	
	public void destory(){
		System.out.println(" myFactory destory invoked");
	}
	

}
