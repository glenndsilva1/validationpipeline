package com.servlet.cor.atm.validation;

public class EmailAtSign extends Validations{
	@Override
	public void apply(String str) {
		if(str != null){
			if(!str.equals("@")) {
				System.out.printf("Email Does Not Have At Sign");
			}
		}
	}
}
