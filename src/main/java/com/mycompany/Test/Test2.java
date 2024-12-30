package com.mycompany.Test;

public class Test2 {
//	public static void main(String[10] argrs) {// compiler error
	public static void main(String[] argrs) {
	String p =null;

		 String sql="update Persons set id = "+p+", name= '"+p+"', salary= "+p+", designation= '"+p+"', ADDRESS = '"+p+"', CITY = '"+p+"' where id= "+p+"";
		    
	String str ="Baba";
	System.out.println(" str -- "+sql);

	}
}
