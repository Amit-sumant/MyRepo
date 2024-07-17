package com.sample.action;

public class MainMethodOverLoad 
{
	static int i=10;
	static int j=25;
	static int c;
	

	public static void main(String[] args) 
	{
			
		System.out.println(c= i*j);
		
		main("This");
		main(5);
		
	}
	
	public static void main(String args)
	{
		System.out.println("Running 2nd Main Method");
	}
	
	public static void main(int a)
	{
		System.out.println(5);
	}

}
