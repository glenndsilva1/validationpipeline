package com.servlet.cor.atm.validation;

public abstract class Validations {
	protected Validations nextDispensor;
	
	public void setNextDispender(Validations nextDispensor){
		this.nextDispensor = nextDispensor;
	}
	
	public abstract void apply(String str);
}
