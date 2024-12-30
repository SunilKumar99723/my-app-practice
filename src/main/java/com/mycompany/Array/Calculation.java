package com.mycompany.Array;

import java.util.StringTokenizer;

public class Calculation {
	  public static int findMax(int arr[]){  
//	        int max=0; 
		  int max=arr[0];//arr[0] instead of 0  
		     for(int i=1;i<arr.length;i++){  
		            if(max<arr[i])  
		                max=arr[i];  
		        }  
		        return max;    
	    }
	  
	  //method that returns cube of the given number  
	    public static int cube(int n){  
	        return n*n*n;  
	    }  
	    
	    //method that returns reverse words   
	    public static String reverseWord(String str){  
	  
	        StringBuilder result=new StringBuilder();  
	        StringTokenizer tokenizer=new StringTokenizer(str," ");  
	  
	        while(tokenizer.hasMoreTokens()){  
	        StringBuilder sb=new StringBuilder();  
	        sb.append(tokenizer.nextToken());  
	        sb.reverse();  
	  
	        result.append(sb);  
	        result.append(" ");  
	        }  
	        return result.toString();  
	    }  
	    
	    public static String reverseWord2(String str) {
	    	
	    	String nstr="";
	        char ch;
	       
	      System.out.print("Original word: " +str);
//	      System.out.println("Geeks"); //Example word
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ nstr);
	      
	      return nstr;
	    }
	    
	}  