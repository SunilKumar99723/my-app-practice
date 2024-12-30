package com.mycompany.example;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;


class AvoidNullException
{ 
    public static void main (String[] args)     { 
   
        String str = null; 
        String str2 = "uh";
        if (StringUtils.isNotEmpty(str)){ // No NPE possible here now
        	 System.out.println("str value -- " +str);
        	 System.out.println("str2 value -- " +str2);
            if (str.equals(str2)) {
                System.out.println("Ooops!!");  // Cannot happen now.
            }
            else 
            {
            	System.out.println(" Not equal ");
            }
        }
    
    }
} 
