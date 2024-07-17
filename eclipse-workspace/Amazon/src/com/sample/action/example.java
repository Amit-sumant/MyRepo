package com.sample.action;

public class example 
{
	public static void run()
	{
		System.out.println("Run");
	}
	
	public void walk()
	{
		System.out.println("walk");
	}

}

class anotherexam extends example
{
	public static void run()
	{
		System.out.println("Run run run");
	}
	
	public void walk()
	{
		System.out.println("walk walk walk");
	}
	
}
