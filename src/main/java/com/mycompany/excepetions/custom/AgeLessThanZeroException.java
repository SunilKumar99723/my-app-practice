package com.mycompany.excepetions.custom;
public class AgeLessThanZeroException extends Exception {  //RuntimeException are unchecked while Exception are checked (calling code must handle them).
//public class AgeLessThanZeroException extends Exception {
	
	AgeLessThanZeroException(String  message){
		
		super(message);
		
	}
	}
