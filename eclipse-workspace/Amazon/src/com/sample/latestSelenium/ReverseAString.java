package com.sample.latestSelenium;

public class ReverseAString 
{

	public static void main(String[] args) 
	{
		String str="WERTTYUI";
		
		String rev="";
		
		//charAt method to find the string position.
		
		int len = str.length();
		
		for(int i=len-1; i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);

	}

}
