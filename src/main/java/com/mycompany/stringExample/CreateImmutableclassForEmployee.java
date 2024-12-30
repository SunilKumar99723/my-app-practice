package com.mycompany.stringExample;
/*
 * The Below class is immutable because:
 * 
 * 1. The instance variable of the class is final i.e. we cannot change the value
 * of it after creating an object. 
 * 2. The class is final so we cannot create the subclass.
 * 3. There is no setter methods i.e. we have no option to change the
 * value of the instance variable. These points makes this class as immutable.
 */
public final class CreateImmutableclassForEmployee{  
final String pancardNumber;  
  
public CreateImmutableclassForEmployee(String pancardNumber){  
this.pancardNumber=pancardNumber;  
}  
  
public String getPancardNumber(){  
return pancardNumber;  
}  
  
/*// Compiler Error : child class is not possible because of "final" keyword is used for CreateImmutableclassForEmployee
 * class B extends CreateImmutableclassForEmployee{ 
 * 
 * public B(String pancardNumber) { super(pancardNumber); // TODO Auto-generated
 * constructor stub }
 * 
 * 
 * }
 */

}  
