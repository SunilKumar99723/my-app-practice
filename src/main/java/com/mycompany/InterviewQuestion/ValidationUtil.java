package com.mycompany.InterviewQuestion;

public class ValidationUtil {
	public String checkForAlphaNumericSpecial(String testString) throws Exception {
		if(!isValidAlphaNumericSpecial(testString)) {
			
			throw new Exception("Exception:  String contains non-alphanumeric charecters");
			
		}
		return testString;
		
		
	}

	private boolean isValidAlphaNumericSpecial(String testString) {
		// TODO Auto-generated method stub
		boolean isValid = true;
		
		if(testString!=null) {
			int strLength = testString.length();
			
			for(int i=0; i<=strLength-1;i++) {
				
				if(!Character.isLetterOrDigit(testString.codePointAt(i))) {
					
				if(Character.isISOControl(testString.codePointAt(i))){
					isValid = false;
				}
				}
			}
			
		}
		return isValid;
	}
}
