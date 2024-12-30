package com.mycompany.InterviewQuestion;


class Car
{
	public static void wheel() {System.out.println("wheel");}
	 void run()
	{
		System.out.println("Car Run");
	}
}

class Tata extends Car{
	// This method overrides print() in Base 
	 void run()
	{
		System.out.println("Indica Running fast");
	}
	
	public static void wheel() {System.out.println("Indica has 4 wheel");}
}

class Hyundai extends Car{ 
	
}


public class StaticAndPrivateMethodTest {
	
	private void x() {System.out.println("x");}

	public static void main(String[] args) {
		StaticAndPrivateMethodTest main = new StaticAndPrivateMethodTest();
		Car c1 = new Tata();
		c1.run();
		c1.wheel();
		Tata.wheel();
		
		Car c2 = new Hyundai();
//		Indica.wheel();
//		main.x();
	}

}
