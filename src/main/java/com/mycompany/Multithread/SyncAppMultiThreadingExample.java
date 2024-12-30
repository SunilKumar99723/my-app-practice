package com.mycompany.Multithread;


class MyThread extends Thread{
	
	Printer pRef;
	MyThread(Printer p){
		pRef = p;
	}
	@Override
	public void run() {
		// Second way of use synchronized . you can use both ways, results will be same.
		//Now No thread can execute or access the printer object till this block is not finished.
		synchronized (pRef) { 
			pRef.printDocument(10,"Babita Profile.pdf");
		}
		
	}
}

class YourThread extends Thread{
	
	Printer pRef;
	YourThread(Printer p){
		pRef = p;
	}
	@Override
	public void run() {
	
			pRef.printDocument(10,"Vishal Profile.pdf");
	
	}
}
public class SyncAppMultiThreadingExample {
	//main method represents main thread
		public static void main(String[] args) {
			System.out.println("<<<---------Application Started ------->>>>>");
			
			// We have only 1 single object of printer
			Printer printer = new Printer();
			//printer.printDocument(10, "Sunil Profile.pdf");
			
			//Scenario: We have multiple thread working on the same Printer object
			// If Multiple threads are going to work on the same single object we must Synchronize them
			MyThread mRef = new MyThread(printer); // MyThread is having reference to the printer object 
			YourThread yRef = new YourThread(printer);
			
			mRef.start();
			/*
			 * try { mRef.join(); } catch (InterruptedException e) { // Instead of using Join() method , use synchronized for Printer method
			 * catch block e.printStackTrace(); // Synchronised method will give same output. Here for every object we cannot use the join() method
			 */
			yRef.start();
			
			System.out.println("<<<---------Application Finished ------->>>>>");
		}
		
}
