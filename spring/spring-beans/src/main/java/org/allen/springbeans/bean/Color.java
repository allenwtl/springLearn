package org.allen.springbeans.bean;



public class Color {

	private String diwen ;
	
	private String mianwen ;

	public String getDiwen() {
		return diwen;
	}

	public void setDiwen(String diwen) {
		this.diwen = diwen;
	}

	public String getMianwen() {
		return mianwen;
	}

	public void setMianwen(String mianwen) {
		this.mianwen = mianwen;
	}
	
	
	@Override
	public String toString() {
		return "diwen " + getDiwen() + "  mianwen " + getMianwen() ; 
	}
	
}
