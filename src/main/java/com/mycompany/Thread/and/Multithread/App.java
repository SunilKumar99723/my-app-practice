package com.mycompany.Thread.and.Multithread;


/*class MyTask{
	void executeTask() {
		for (int doc=1; doc<=10; doc++)
		{
			System.out.println("Printing document # "+doc+ " For Printer 2");
		}
	}
}
*/
//MyTask IS-A Thread
/*class MyTask extends Thread{
	@Override
	public void run() {
		for (int doc=1; doc<=10; doc++)
		{
			System.out.println("Printing document # "+doc+ " For Printer 2");
		}
	}
}*/

class CA{
	
}
//class MyTask extends CA, Thread{ -> Error| Because Multiple inheritence Not supported in java
class MyTask extends CA implements Runnable{
	@Override
	public void run() {
		for (int doc=1; doc<=10; doc++)
		{
			System.out.println("Printing document # "+doc+ " For Printer 2");
		}
	}
}

class YourTask extends CA implements Runnable{
	@Override
	public void run() {
		for (int doc=1; doc<=10; doc++)
		{
			System.out.println("Printing document # "+doc+ " For Printer 3");
		}
	}
}

public class App {

	//main method represents main thread
	public static void main(String[] args) {
		// whatever we write in here will executed by main thread
		//Threads always execute the jobs in a sequence
		//Execution context 
		
		//job 1
		System.out.println("<<<---------Application Started ------->>>>>");

		//job 2
		// MyTask task = new MyTask(); //  Child Thread / Worker Thread
		// task.executeTask();
		// task.start();// start shell internally execute run method
		// Now , main and MyTask are executing both parallely or concurrently !!
		 
		Runnable r = new MyTask();
		Thread task = new Thread(r);
		task.setDaemon(true);// Any thread can be marked as a Daemon Thread
		// Daemon Thread is a thread which is going to be executed by the JVM whenever the application starts
		// it goes to execute the Thread along with main Thread
		
		task.start(); // Thread 1 for MyTask
		
//		Thread yourTask = new Thread(new YourTask());
//		yourTask.start();
		
//		OR
		
		new Thread(new YourTask()).start(); //  Thread 2 for YourTask,Now multiple thread is running
		
		// Till job 2 is not finished, below written jobs are waiting and are not executed
		//In case job 2 is long running operation , i.e. several documents are suppose to be printed
		//In such a case OS/JVM shall give a message that app is not responding
		//Some sluggish behavior in app can be observed  --> app seems to hang
		
		//job 3
		for (int doc=1; doc<=10; doc++)
		{
			System.out.println("Printing document # "+doc+" for Printer 1");
		}
		
		//job 4
		System.out.println("<<<---------Application Finished ------->>>>>");
	}

}
