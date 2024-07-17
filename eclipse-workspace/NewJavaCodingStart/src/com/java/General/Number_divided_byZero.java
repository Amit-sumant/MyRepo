package com.java.General;

public class Number_divided_byZero {

	public static void main(String[] args) 
	{
		//double n = 10.0;
		
		try
		{
			System.out.println(0/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println(10.2/0);
		System.out.println(0.0/0);
		System.out.println(5.0/5.0);
		
		/////////////////////////////////
		
		System.out.println("");
		
		long num = 100*800*609*770L;
		long num1 = 100*800*609*770L;
		
		System.out.println(num);
		System.out.println(num1);
		

	}

}
