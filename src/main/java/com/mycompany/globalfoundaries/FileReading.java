package com.mycompany.globalfoundaries;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReading {
	public static void main(String[] args) throws Exception {
		
		
//		Method 1: Using FileReader class
		//FileReader(String file)- It gets filename in string. It opens the given file in read mode. If file doesn't exist, it throws FileNotFoundException.
		System.out.println("Method 1: Using FileReader class");
		FileReader fileRead = new FileReader("C:\\InputFile\\InputFile.txt");
		
//		System.out.print(fileRead.read());
		int i;
		while((i=fileRead.read())!=-1)
		{		
//			System.out.print((char)i);
				
		}
		
		fileRead.close();
		
		
//		Method 2: Using Scanner class:A simple text scanner which can parse primitive types and strings using regular expressions.
//		A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace.
//		The resulting tokens may then be converted into values of different types using the various next methods.
		
		System.out.println("Method 2: Using FileReader class");
		Scanner input = new Scanner(new File("C:\\InputFile\\InputFile.txt"));

		 while (input.hasNext()) {
		        String line = input.nextLine();
		        // Now, check if this line contains our keyword. If it does, print the line
		        if (line.contains("D_DUT23_S_02")) {
//		            System.out.println(line);
		        }
		 }
		 
		 
		 
//			Method 2: Using Scanner class but without using loops:
		 System.out.println("Method 3:  Using Scanner class but without using loops");
		 File file = new File("C:\\InputFile\\InputFile.txt");
		    Scanner sc = new Scanner(file);
		   // we just need to use \\Z as delimiter
		    sc.useDelimiter("\\Z");
		    System.out.println(sc.next());
	}

}
