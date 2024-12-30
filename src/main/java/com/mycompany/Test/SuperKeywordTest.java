package com.mycompany.Test;
class XYZ{
	
	void xMethod(){

	System.out.println(" Hello XYZ ");	
	}
	
}

class ABC extends XYZ{

	void xMethod() {
		super.xMethod();
		System.out.println(" Hello ABC ");
	
	
	}
}
public class SuperKeywordTest {
	public static void main(String[] argrs) {

		XYZ x =  new ABC();
		x.xMethod();
	}
}
