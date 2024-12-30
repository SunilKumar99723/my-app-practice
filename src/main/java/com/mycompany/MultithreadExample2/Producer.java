package com.mycompany.MultithreadExample2;

public class Producer extends Thread{
	
	 Company c;

	 Producer(Company c){
			this.c =c;	
		}
	 
	 public void run() {
		 
		 int i=1;
		 
		 while(true) {
			 
			 try {
				this.c.produce_Items(i);
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
			 i++;
		 }
	 }
}
