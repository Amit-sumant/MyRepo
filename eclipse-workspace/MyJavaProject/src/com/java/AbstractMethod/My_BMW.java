package com.java.AbstractMethod;

public class My_BMW implements My_Car 
{

	@Override
	public void start() 
	{
		System.out.println("This is Start Method override from Car");
		
	}

	@Override
	public void run() 
	{
		System.out.println("This is Run Method override from Car");
		
	}

	@Override
	public void accelarate() 
	{
		System.out.println("This is accelarate Method override from Car");
		
	}
	
}
