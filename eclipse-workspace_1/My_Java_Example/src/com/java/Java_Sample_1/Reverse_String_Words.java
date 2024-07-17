package com.java.Java_Sample_1;

public class Reverse_String_Words {

	public static void main(String[] args) 
	{
		String str="Arnav Amit Ashwini Sumant";
		
		String s[] = str.split(" ");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.println(s[i]);
		}
		

	}

}
