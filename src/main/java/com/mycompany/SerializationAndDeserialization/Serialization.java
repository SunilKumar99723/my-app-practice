package com.mycompany.SerializationAndDeserialization;

	import java.io.*;
	
	//Serialization in Java is a mechanism of writing the state of an object into a byte-stream.
//	convert object  to a byte-stream 
	//Also called marshalling
	class Serialization{    
	 public static void main(String args[]){    
	  try{    
	  //Creating the object    
	  Student s1 =new Student(211,"*******************Sunil Kumar***********************");    
	  //Creating stream and writing the object    
	  FileOutputStream fout=new FileOutputStream("C:\\JavaPractice\\Serialize.txt");    
	  ObjectOutputStream out=new ObjectOutputStream(fout);    
	  out.writeObject(s1);    
	  out.flush();    
	  //closing the stream    
	  out.close();    
	  System.out.println("success");    
	  }catch(Exception e){System.out.println(e);}    
	 }    
	}    
