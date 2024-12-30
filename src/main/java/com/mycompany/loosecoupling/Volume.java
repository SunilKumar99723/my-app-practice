package com.mycompany.loosecoupling;

//Java program to illustrate 
//loose coupling concept 
/*
Explanation : In the Below program, there is no dependency between both the classes.
If we change anything in the Box classes then we dont have to change anything in Volume class.
*/
final class Box 
{ 
	private int volume; 
	Box(int length, int width, int height) 
	{ 
		this.volume = length * width * height; 
	} 
	public int getVolume() 
	{ 
		return volume; 
		
	} 
} 


class Volume 
{ 
	public static void main(String args[]) 
	{ 
		Box b = new Box(5,5,5); 
		System.out.println(b.getVolume()); 
	} 
} 