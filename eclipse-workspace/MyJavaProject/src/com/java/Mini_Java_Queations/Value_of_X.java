package com.java.Mini_Java_Queations;

public class Value_of_X {

	public static void main(String[] args) 
	{
		String x = "abc";
		String y = "xyz";
		
		x.concat(y); // here string is immutable so ans will be only abc
		String z = x.concat(y);
		
		System.out.println(x);
		System.out.println(z);
		
		System.out.println("------------Every first letter Capital------------------");
		
		String str = "arnav ashwini amit sumant";
		//String str = "a";
		String word[] = str.split("\\s");
		String res = "";
		
		if(str.length()==1) // this condition only fulfill when there is only one string like a, b or c
		{
			
			System.out.println(str.toUpperCase());
		}
		else
		{
			for(String s : word)
			{
				String first = s.substring(0, 1).toUpperCase();
				String strFirst = s.substring(1);
				res = res + first + strFirst + " ";
			}
			
			//System.out.println(res);
			System.out.println(res.trim());
		}
		
	}

}
