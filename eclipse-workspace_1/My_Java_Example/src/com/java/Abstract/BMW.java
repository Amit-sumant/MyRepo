package com.java.Abstract;

public class BMW extends Vehicle
{
	
	BMW()
	{
		System.out.println("This is BMW Constructor");
	}

	public static void main(String[] args) 
	{
		Vehicle v=new BMW();
		v.gear();
		v.speed();
		v.speed1();

	}

	void speed1() 
	{
		System.out.println("This is method override from Speed");
		
	}

	void gear() 
	{
		System.out.println("This is method override from Gear");
		
	}

}
