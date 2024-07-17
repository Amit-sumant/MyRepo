package com.sample.action;

public class MainOverriddenPrivateMethod 
{

	public static void main(String[] args) 
	{
		overridePrivateMethod oo=new image();
		oo.show();
		
		image i=new image();
		i.show();
		
		overridePrivateMethod ii=new overridePrivateMethod();
		ii.show();

	}

}
