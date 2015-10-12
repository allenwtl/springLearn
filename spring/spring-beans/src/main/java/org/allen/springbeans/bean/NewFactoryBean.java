package org.allen.springbeans.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.SmartFactoryBean;

public class NewFactoryBean implements SmartFactoryBean<Color> {

	@Override
	public Color getObject() throws Exception {
		Color color = new Color();
		color.setDiwen("red");
		color.setMianwen("nimei");
		return color ;
	}

	@Override
	public Class<?> getObjectType() {
		
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPrototype() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEagerInit() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
