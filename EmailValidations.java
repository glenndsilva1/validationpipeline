package com.servlet.cor.atm.validation;

public class EmailValidations {
	protected static Validations emailatsign = new EmailAtSign();
	protected static Validations emaildotsign = new EmailDotSign();
	protected static Validations chain;
	
	static {
		emailatsign.setNextDispender(emaildotsign);
		chain = emailatsign;
	}
	
    public static void validate(String str){
        if(str != null){
            chain.apply(str);
        }
    }
    
    public static void main(String args[]){
    	validate("glenngmailcom");
    }
}
