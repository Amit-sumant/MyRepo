package com.java.Java_Sample_1;

public class Reverse_String_using_While {

	public static void main(String[] args) 
	{
		String str = "Hello";
		String rev="";
		
		int len = str.length();
		int index = len-1;
		
		while(index>=0)
		{
			rev = rev + str.charAt(index);
			index--;
		}
		
		System.out.println(rev);
	

	}

}
