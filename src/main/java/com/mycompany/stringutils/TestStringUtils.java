package com.mycompany.stringutils;

import org.apache.commons.lang3.StringUtils;

public class TestStringUtils {
public static void main(String[] args) {
	
	System.out.println("<<<<----------------StringUtils.abbreviate ----------->>>>>");
//	System.out.println(StringUtils.abbreviate(null, 1));
//	System.out.println(StringUtils.abbreviate("", 4));
//	System.out.println(StringUtils.abbreviate("abcdefg", 6));
//	System.out.println(StringUtils.abbreviate("abcdefg", 7));
//	System.out.println(StringUtils.abbreviate("abcdefg", 8));
//	System.out.println(StringUtils.abbreviate("abcdefg", 4));
//	 
//	System.out.println(StringUtils.abbreviate("abcdefghijklmno", -1, 10));
//	System.out.println(StringUtils.abbreviate("abcdefghijklmno", 0, 10));
//	System.out.println(StringUtils.abbreviate("abcdefghijklmno", 1, 10));
//	System.out.println(StringUtils.abbreviate("abcdefghijklmno", 4, 10));
//	System.out.println(StringUtils.abbreviate("abcdefghijklmno", 5, 10));
//	System.out.println(StringUtils.abbreviate("abcdefghijklmno", 6, 10));
//	System.out.println(StringUtils.abbreviate("abcdefghijklmno", 8, 10));
//	System.out.println(StringUtils.abbreviate("abcdefghijklmno", 10, 10));
//	System.out.println(StringUtils.abbreviate("abcdefghijklmno", 12, 10));
	
//	String str="ssJAVAdfkglugi";
//	if(StringUtils.containsIgnoreCase(str, "JAVA"))
//        System.out.println(str+" is about Java");
//    else
//        System.out.println(str+" is not about Java");
     
	
	String  x=null,
			x1=null,
			x2="Apple",
			x3="Mango";
   
    //using StringUtils.equals()
//    if(StringUtils.equals(x1, x2))
//        System.out.println("x1 and x2 are equal "+x1+ "  "+x2);
//    else
//        System.out.println("x1 and x2 are not equal "+x1+ "  "+x2);
//    
    if(StringUtils.equalsIgnoreCase(x, x3))
        System.out.println("x and x3 are equal "+x+ "  "+x3);
    else
        System.out.println("x and x3 are not equal "+x+ "  "+x3);
	

}
}
