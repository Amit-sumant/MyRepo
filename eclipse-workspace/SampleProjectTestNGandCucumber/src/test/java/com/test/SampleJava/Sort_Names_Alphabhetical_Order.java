package com.test.SampleJava;

import java.util.Arrays;

public class Sort_Names_Alphabhetical_Order {

	public static void main(String[] args) 
	{
		String name[] = {"A","F","Z","D","G","M"};
		
		Arrays.sort(name);
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		
		System.out.println("----------------------------------------");
		System.out.println("Using another method");
		
		

	}

}
