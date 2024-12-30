package com.mycompany.OverloadingAndOverriding;
//  Compile-time polymorphism is achieved through method overloading.
//Method overloading is a concept of Java in which we can create multiple methods of the same name in the same class, 
//and all methods work in different ways.
//When more than one method of the same name is created in a Class, this type of method is called the Overloaded Method.
public class OverLoadingCocept {
	
//	<<<<<<=========Method 1: By changing the number of parameters. ======>>
   public int add(int a, int b) {   int sum = a + b;  return sum;   }
   public int add(int a, int b, int c) {  int sum = a + b + c; return sum;  }
   
//	<<<<<<=========Method 2: By changing the Data types of the parameters  ======>>   
    public double add(double a, double b, double c) {   double sum = a + b + c;  return sum;  }
    
//	<<<<<<=========Method 3: By changing the Order of the parameters   ======>>   
    public void Identity(String name, int id) { System.out.println("Name :" + name + " " + "Id :" + id); }
    public void Identity(int id, String name) { System.out.println("Id :" + id + " "+ "Name :" + name);  }
    
//	<<<<<<=========What happens when method signature is the same and the return type is different?======>>   
    // Answer:Compiler Error
//    public int addTwoNumber(int a, int b) {   int sum = a + b; return sum;  }
      public double addTwoNumber(int a, int b) {   double sum = a + b + 0.0;   return sum;  }
      
      
//	<<<<<<=========Can we overload main or static method? , Answer : Yes, but Signature must be different======>>
    public static void main(int a) {}
    public static void main(String args) {}
    
    
//	<<<<<<=========Can we overload final method? , Answer : Yes======>>
    public final void area(int a, int b, int c) {}
    public final void area(int a, int b) {}
    
//	<<<<<<=========can we overload the methods if they are only different by static keyword?, Answer : NO======>>  
//    public static void sum(int a, int b) { int c=a+b; System.out.println("The sum is: "+c); } 
    public  void sum(int a, int b){ int c=a+b; System.out.println("The sum is: "+c); }   
    
}
