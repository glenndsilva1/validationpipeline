package com.servlet.cor.atm.validation;

public class EmailValidations {
	protected static Validations emailvalidchain = new EmailAtSign();
	protected static Validations emaildotsign = new EmailDotSign();
	
	static {
		emailvalidchain.setNextDispender(emaildotsign);
	}
	
    public static void validate(String str){
        if(str != null){
            emailvalidchain.apply(str);
        }
    }
    
    public static void main(String args[]) {
    	validate("glenn@gmailcom");
    }
}
