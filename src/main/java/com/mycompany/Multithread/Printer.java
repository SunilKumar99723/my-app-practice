package com.mycompany.Multithread;

class Printer{
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
