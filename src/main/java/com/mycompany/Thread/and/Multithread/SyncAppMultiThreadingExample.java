package com.mycompany.Thread.and.Multithread;


class Printer{
	
	public Printer() {
		// TODO Auto-generated constructor stub
	}
	// 1st way of use synchronized
	// synchronized method - when your thread is going to execute printDocument() method, it will aquire a lock. 
	//Now once the lock is aquired no other thread can print the document.
	// Benifit is we will not call the join method for each and every thread.
//	synchronized void printDocument(int numOfCopies, String docName) {
	void printDocument(int numOfCopies, String docName) {
		for (int i=1; i<=numOfCopies; i++)
		{
			/*
			 * try { Thread.sleep(100); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
			System.out.println("Printing document # "+docName+ " "+i);
		}
	}
}


class MyThread extends Thread{
	
	Printer pRef;
	MyThread(Printer p){
		pRef = p;
	}
	@Override
	public void run() {
		// 2nd way of use synchronized . you can use both ways, results will be same.
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
