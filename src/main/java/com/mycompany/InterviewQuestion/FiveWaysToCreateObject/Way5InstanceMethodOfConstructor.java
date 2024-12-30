package com.mycompany.InterviewQuestion.FiveWaysToCreateObject;
import java.lang.reflect.Constructor;




public class Way5InstanceMethodOfConstructor  
{  
String str="hello";  
public static void main(String args[])  
{  
try  
{  
Constructor<Way5InstanceMethodOfConstructor> obj = Way5InstanceMethodOfConstructor.class.getConstructor();  

Way5InstanceMethodOfConstructor obj1 = obj.newInstance();  

System.out.println(obj1.str);  
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}  