package com.mycompany.MultithreadExample2;

public class Consumer extends Thread{
	 Company c;

	 Consumer(Company c){
			this.c =c;	
		}
	 
	 public void run() {
		 
		 int i=1;
		 
		 while(true) {
			 
			
			 try {
				 this.c.consume_Items();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 i++;
		 }
	 }
}
