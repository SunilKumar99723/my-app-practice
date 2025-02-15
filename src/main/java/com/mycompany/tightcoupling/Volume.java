package com.mycompany.tightcoupling;

//Java program to illustrate 
//tight coupling concept 
/*
Explanation:In the above example, there is a strong inter-dependency between both the classes. 
If there is any change in Box class then they reflects in the result of Class Volume.
*/
class Box 
{ 
	public int volume; 
	Box(int length, int width, int height) 
	{ 
		this.volume = length * width * height; 
	} 
} 
class Volume 
{ 
	public static void main(String args[]) 
	{ 
		Box b = new Box(5,5,5); 
		System.out.println(b.volume); 
	} 
} 