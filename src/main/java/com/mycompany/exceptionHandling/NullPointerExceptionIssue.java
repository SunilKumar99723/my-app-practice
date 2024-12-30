package com.mycompany.exceptionHandling;

/* 
   Thrown when an application attempts to use null in a case where an object is required. These include:

	1. Invoking a method from a null object.
	2. Accessing or modifying a null object�s field.
	3. Taking the length of null, as if it were an array.
	4. Accessing or modifying the slots of null object, as if it were an array.
	5. Throwing null, as if it were a Throwable value.
	6. When you try to synchronize over a null object.

	Why do we need the null value? 
	- It is mainly used to indicate that no value is assigned to a reference variable. 
*/

public class NullPointerExceptionIssue {
	public static void main (String[] args)
    {
        // Initializing String variable with null value
        String ptr = null;  
 
        // Checking if ptr.equals null or works fine.
        try
        {
            // This line of code throws NullPointerException
            // because ptr is null
            if (ptr.equals("Sunil")) // We can avoid NullPointerException by calling equals on literal rather than object. -    if ("gfg".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }
}
