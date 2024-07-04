package com.servlet.cor.atm.validation;

public class EmailDotSign extends Validations {
	EmailDotSign() {
		super();
	}

	@Override
	public void apply(String str) {
		if (str != null) {
			if (!str.contains(".")) {
				System.out.println("Email Does Not Have Dot Sign");
			}
		}
		if(nextDispensor!=null) {
			nextDispensor.apply(str);
		}else {
			System.out.println("Stop Validations Over");
		}
	}
}
