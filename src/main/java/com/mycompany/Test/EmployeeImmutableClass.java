package com.mycompany.Test;

public final class EmployeeImmutableClass {
    
	final String pancardNumber;   
	
	public EmployeeImmutableClass(String pancardNumber)  
	{    
			this.pancardNumber= pancardNumber;    
	}  
	
	public String getPancardNumber(){    
			return pancardNumber;    
			} 
	
	}

	/*
	 * The above class is immutable because:
	 * 
	 * 1. The instance variable of the class is final i.e. we cannot change the value
	 * of it after creating an object. 
	 * 2. The class is final so we cannot create the
	 * subclass. 
	 * 3. There is no setter methods i.e. we have no option to change the
	 * value of the instance variable. These points makes this class as immutable.
	 * 
	 * 
	 */