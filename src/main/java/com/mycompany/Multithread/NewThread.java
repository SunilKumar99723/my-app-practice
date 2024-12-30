package com.mycompany.Multithread;

//Create Multiple Thread
public class NewThread implements Runnable {
	 String name;
	 Thread t;
	
 public NewThread(String threadName) {
		name = threadName;
		t = new Thread(this,name);
		System.out.println("New Thread :  " +t);
	}

 // This is entry point for thread
	@Override
	public void run() {
try {
		for (int i=5;i>0; i--) {
			System.out.println(name  + ":  "+i);
			Thread.sleep(1000);
		}
		
	}
	catch(InterruptedException e) {
		
		System.out.println("Intruppted Exception  " +name);
	}
		System.out.println(name+" Existing" );
}
	
}
