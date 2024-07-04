package com.servlet.cor.atm.validation;

public class EmailAtSign extends Validations {
	public EmailAtSign() {
		super();
	}

	public void apply(String str) {
		if(str != null){
			if(!str.contains("@")){
				System.out.println("Email Does Not Have At Sign");
			}
		}
		if(nextDispensor != null){
			nextDispensor.apply(str);
		}else {
			System.out.println("Stop Validations Over");
		}
	}
}
