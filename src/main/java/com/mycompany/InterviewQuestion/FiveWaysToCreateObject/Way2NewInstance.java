package com.mycompany.InterviewQuestion.FiveWaysToCreateObject;

/*Java Class.newInstance() is the method of Class class. The Class class belongs to java.lang package.
It creates a new instance of the class represented by this Class object. 
It returns the newly created instance of the class.
Syntax :

public T newInstance() throws IllegalAcccessException, InstantiationException  

It throws IllegalAccessException if the class or its nullary constructor is not accessible. 
It also throws InstantiationException, if the Class represents an abstract class, an interface, an array class, or a primitive type.
*/
public class Way2NewInstance {

	String name ="Way2 : NewInstance";
	
	public static void main(String[] args) {
	
		try {
			Way2NewInstance	newInstanceObj = Way2NewInstance.class.newInstance();//creating object of class 
			 System.out.println(newInstanceObj.name);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	  
	 
	}
}
