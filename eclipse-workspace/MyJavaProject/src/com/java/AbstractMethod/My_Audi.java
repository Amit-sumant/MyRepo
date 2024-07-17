package com.java.AbstractMethod;

public class My_Audi implements My_Car 
{

	@Override
	public void start() {
		System.out.println("This is Audi Start Method override from Car");
		
	}

	@Override
	public void run() {
		System.out.println("This is Audi Run Method override from Car");
		
	}

	@Override
	public void accelarate() {
		System.out.println("This is Audi accelerate Method override from Car");
		
	}
	
	public void carSafety()
	{
		System.out.println("This is Audi own method");
	}
	
}
