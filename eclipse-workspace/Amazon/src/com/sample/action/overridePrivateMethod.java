package com.sample.action;

public class overridePrivateMethod 
{
	private void display()
	{
		System.out.println("this is private void display method");
	}
	
	public void show()
	{
		System.out.println("THis is public show");
	}

}

class image extends overridePrivateMethod
{
	private void display()
	{
		System.out.println("this is private void display method under image");
	}
	
	public void show()
	{
		System.out.println("THis is public show under image");
	}
}
