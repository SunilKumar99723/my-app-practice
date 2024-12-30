package com.mycompany.InterviewQuestion;

public class CheckAlphaNumeric {
	public static void main(String[] argrs) throws Exception {
    ValidationUtil validUtil = new ValidationUtil();
    
    String str = "euytoiujj?";
    
    validUtil.checkForAlphaNumericSpecial(str);
    System.out.println(validUtil.checkForAlphaNumericSpecial(str));
	}
}
