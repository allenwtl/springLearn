package org.allen.springbeans.bean;

import org.springframework.stereotype.Service;

@Service
public class Animal {

	private String name;

	private Color color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "animal's name " + getName() + " color " + getColor();
	}

}
