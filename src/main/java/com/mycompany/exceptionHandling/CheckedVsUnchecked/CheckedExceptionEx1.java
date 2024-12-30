package com.mycompany.exceptionHandling.CheckedVsUnchecked;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
/*
 * 1 .Checked Exeption - IOException,InterruptedException, SQLException ,ClassNotFoundException
 * 
 * 2. When SQLException can occur in Java? 
 * Answer: SQLException occurs if there is an error in the database access or other errors related to the database. 
 * When SQLException occurs, an object of type SQLException will be passed to the catch clause. 
 * We can handle it in the Catch block.
 * 
 * 3. ClassNotFoundException -ClassNotFoundException occurs when the JVM tries to load a particular class but does not find it in the classpath.
 * 4. IOException - is thrown when an error occurred during an input-output operation. 
 * That can be reading/writing to a file, a stream (of any type), a network connection, connection with a queue, a database etc,
 *  pretty much anything that has to do with data transfer from your software to an external medium.
 * 4. Class InterruptedException - Thrown when a thread is waiting, sleeping, or otherwise occupied, 
 * 									and the thread is interrupted, either before or during the activity.
 * 									
 * 
 */
public class CheckedExceptionEx1 {
	
	public static void main(String[] args) throws IOException,InterruptedException,SQLException {
		// IOException occurs but inform to JVM to handle it 
		FileReader fR = new FileReader("C:\\Users\\sunil\\OneDrive\\Desktop\\baba.txt");
		System.out.println(fR.read());
		
		
		// InterruptedException occurs but inform to JVM to handle it 
		for(int i =0; i<10;i++) {
			System.out.println(i);
			Thread.sleep(1000);// This line will give compile error/Checked Error - InterruptedException
			
		}
		
		
	}

}
