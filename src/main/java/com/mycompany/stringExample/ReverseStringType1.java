package com.mycompany.stringExample;
// reverse string without using inbuild function
public class ReverseStringType1 {

	public static void main(String[] args)
    {
        String input = "Sunil home";
//       String ip[] = input.split(""); 
        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = input.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        
//        String s = new String(result);
//        System.out.println(s.split(""));
        System.out.println(new String(result));
    }
}
