package com.mycompany.SerializationAndDeserialization;


//Deserialization in Java is a mechanism of convert  byte-stream  into a object.
	import java.io.*;  
	class DeSerialization{  
	 public static void main(String args[]){  
	  try{  
	  //Creating stream to read the object  
	 // ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\JavaPractice\\Serialize.txt"));  
		  
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\sunil\\git\\Practice\\Practice\\bin\\Base.class"));  
		  
	  
	  Student s=(Student)in.readObject();  
	  //printing the data of the serialized object  
	  System.out.println(s.getId() +" "+ s.getName());
	  //closing the stream  
	  in.close();  
	  }catch(Exception e){System.out.println(e);}  
	 }  
	}  