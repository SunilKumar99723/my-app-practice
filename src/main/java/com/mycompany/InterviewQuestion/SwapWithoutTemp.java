package com.mycompany.InterviewQuestion;

public class SwapWithoutTemp {  
    public static void main(String args[]) {  
        String a = "Javax";  
        String b = "Study";  
        System.out.println("Before swap: a = " + a + " b = " + b);  
        a = a + b;  //concatinate
        System.out.println("a = a + b = " + a );  
         int x =a.length() ; 
         int y = b.length();
         System.out.println("Length of a = " + x + " Length of b = " + y); 
         
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After Swap : a = " + a + " b = " + b);  
    }  
} 

//Output :
//	
//	Before swap: a = Javax b = Study
//	a = a + b = JavaxStudy
//	Length of a = 10 Length of b = 5
//	After Swap : a = Study b = Javax
