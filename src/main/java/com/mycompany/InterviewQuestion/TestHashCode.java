package com.mycompany.InterviewQuestion;

//What is HashCode

/*The hashCode() method is a Java Integer class method which returns the hash code for the given inputs. 
There are two different types of Java hashCode() method which can be differentiated depending on its parameter.
These are:

Java Integer hashCode() Method -Java 1.2 and above
syntax : public int hashCode() -It returns a hash code value for this object, equal to the primitive int value represented by this Integer object. 

Java Integer hashCode(int value) Method -Java 1.8 and above
Syntax : public static int hashCode(int value)  -It returns a hash code value for an int value specified in the method argument.
*/

public class TestHashCode {

	public static void main(String[] args) {
	         String Str = new String("Sunil KPMG");				      
	       //hashCode() -This method returns a hash code value for this object.
	         System.out.println("Hashcode for Str :" + Str.hashCode() );
	         
	         
//	         Integer i = new Integer(155);  
//	         int hashValue = i.hashCode(); 
//	         System.out.println("Hash code Value for object is: " + hashValue);  
	         
	         String age ="Fifty";
	         int hashValueforAge = age.hashCode();  
	         System.out.println("Hash code Value for object is: " + hashValueforAge);  
	         
		   }

	}


//108502768,931381388
