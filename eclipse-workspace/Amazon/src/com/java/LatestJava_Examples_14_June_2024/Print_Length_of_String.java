package com.java.LatestJava_Examples_14_June_2024;

public class Print_Length_of_String {

	public static void main(String[] args) 
	{
		String str = "Hello Java Program";
		
		int num = 0; int cnt=0;
		
		String str1[] = str.split(" ");
		
		for(int i=0;i<str1.length;i++)
		{
			//char ch[] = str1[i].toCharArray();
			System.out.println(str1[i] + " = " + str1[i].length());
		}

	}

}
