package com.mycompany.stringExample;

/*
How to create a mutable string in java?
To create a mutable string, we can use StringBuffer and StringBuilder class. 
Both classes create a mutable object of string but which one we should use is totally depends on the scenario.

*/

/*
How does mutable string work in memory?
		StringBuffer str1 = new StringBuffer("JavaGoal");
		StringBuilder str2 = new StringBuilder("Learning");
After execution of the above line, the JVM will create two objects in memory and return the reference to the variable.		
		str1.append(".com");
		str2.append(" website");
After execution of the above line, the JVM will change the value in existing objects. It will not create new objects.
*/
public class MutableString {
	
	 public static void main (String[] args)
	    {
	        StringBuffer str1 = new StringBuffer("JavaGoal");
	        StringBuilder str2 = new StringBuilder("Learning");
	        
	        System.out.println("(StringBuffer)Value of str1 before change :" + str1);
	        System.out.println("(StringBuilder)Value of str2 before change :" + str2);
	        
	        str1.append(".com");
	        str2.append(" website");
	        
	        System.out.println("(StringBuffer)Value of str1 after change :" + str1);
	        System.out.println("(StringBuilder)Value of str2 after change :" + str2);
	    }

}
