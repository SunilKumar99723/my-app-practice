package com.mycompany.MultithreadExample2;

public class Company {
	// simply one thread will produce and other thread will consume. This is called inter process or inter connection with multi(two) thread 	
	int n;
	boolean b = false;
	// if b = false then chance for Producer_Items
	// if b = true then chance for consume_Items 
	synchronized public void produce_Items(int n) throws InterruptedException {
		
		if(b) { // This will wait execute till b = false
			wait();
		}
		this.n=n;
		System.out.println("Produced items : " +this.n);
		
		b=true; // once execution completed  b= true and notify to execute consume_Items() 
		notify();
	}
	
	synchronized public int consume_Items() throws InterruptedException {
		if(!b) { // This will wait execute till b is not equal to  "false" (b= true)
			
			wait();
		}
		System.out.println("Consumed items : " +this.n);
		b =false; // once execution completed  b= false and notify to execute produce_Items() 
		notify();
		return this.n;
	}
}
