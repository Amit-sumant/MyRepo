package com.java.General;

public class Pass_null_argument_with_method_overloading 
{
	
	
	public static void Stringnull(String s) 
	{
		System.out.println("String");
	}
	 

	public static void Stringnull(Object d)
	{
		System.out.println("Non String");
	}

	public static void main(String[] args) 
	{
		Pass_null_argument_with_method_overloading pass=new Pass_null_argument_with_method_overloading();
		pass.Stringnull(null);
	}

}
