package com.mycompany.map;

import java.util.HashMap;

public class DataValue {
	static public void dataValue(String strData) {
		
		String token[] = strData.split(",");
		HashMap dataMap = new HashMap();
		
		for(int i =0; i<token.length;i++) {
//			String dataValuePair[] = token[i].replace('a', 'z').split(":");
			String dataValuePair[] = token[i].trim().split(":");
			dataMap.put(dataValuePair[0], dataValuePair[1]);
			
		}
		System.out.println(" key set -- "+dataMap.keySet());
		
	}
	
	public static void main(String[] argrs) {
		
		DataValue.dataValue("I am sunil :;");
		

	}
}
