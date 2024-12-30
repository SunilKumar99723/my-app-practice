package com.mycompany.test2;

class Base {
  void method() throws RuntimeException, Exception {
    System.out.println("SuperClass");
  }
}
class SubClass extends Base {
  void method() throws Exception {
System.out.println("SubClass");
  }
  public static void main(String args[]) throws RuntimeException, Exception {
    Base s = new SubClass();
    s.method();
  }
}