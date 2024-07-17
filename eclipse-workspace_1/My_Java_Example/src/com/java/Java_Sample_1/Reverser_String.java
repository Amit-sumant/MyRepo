package com.java.Java_Sample_1;

public class Reverser_String {

	public static void main(String[] args) 
	{
		String str = "Hello";
		String rev="";
		
		/*int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}*/
		
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
