package com.mycompany.abstractAndInterface;

interface ClientAjay {
//client Requirements
	
	int amt =50000; //By default(without declare) variable under interface will be => public+ static + final 
	void rateOfBike(); // public + abstract 
	
}

class HeroHonda implements ClientAjay{

	public void rateOfBike() {
		// TODO Auto-generated method stub
		//amt= 10; "Final" - Due to final you cannot assign the value , can't change the final value
		System.out.println("Hero Honda purchase price is "+amt);
	}
	
}
class CheckInterface{
public static void main(String[] args) {
	HeroHonda cA = new HeroHonda();
	cA.rateOfBike();
	System.out.println(HeroHonda.amt); // Static - This proved the "amt" is static
	
}
}
