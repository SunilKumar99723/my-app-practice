package com.mycompany.Keyword;


class Sample{
	
	private int ramAge;
	private String name;
	Sample(){
//	this(25);
	this(30,"Ram");
	this.access();
	this.access2();
	}
	Sample(int ramAge)
	{
		this.ramAge=ramAge;
	}
	Sample(int ramAge,String name)
	{
		this.ramAge=ramAge;
		this.name=name;
	}
	void access() {
		System.out.println("Age = "+ramAge+ " Name - "+name);
	}
	void access2()
	{
		System.out.println("Age = "+ramAge+ " Name - "+name);
	}
}
public class ThisKeywordDemo {

	public static void main(String[] args) {
		Sample s = new Sample();
		

	}

}
