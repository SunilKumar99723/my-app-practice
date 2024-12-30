package com.mycompany.Multithread;


public class CreateMultipleThreadDemo {
	public static void main(String[] argrs) {
		
		NewThread t1 = new NewThread("One");
		NewThread t2 = new NewThread("Two");
		NewThread t3 = new NewThread("Three");
		
		//Start the thread
		t1.t.start();
		t2.t.start();
		t3.t.start();
		
		try {
			//wait for other thread to end
			Thread.sleep(10000);
			
		}catch (Exception e) {
		System.out.println(" Main Thread Intruppted");
		}
		
		System.out.println(" Main Thread Existing"); // In last the main thread is existing
	}
}
