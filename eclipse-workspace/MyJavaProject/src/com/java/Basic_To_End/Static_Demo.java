package com.java.Basic_To_End;

public class Static_Demo 
{
	static int a=500;
	int b=400;
	int sum=0;
	
	static void m1()
	{
		System.out.println("This is Static Method");
		
		Static_Demo ss=new Static_Demo();
		
		ss.sum = a + ss.b;
		System.out.println(ss.sum);
		
	}
	
	void m2()
	{
		System.out.println("THis is non static method");
	}
	
	void m3()
	{
		System.out.println("This is also non static methood");
	}

	public static void main(String[] args) 
	{
		Static_Demo sd =new Static_Demo();
		m1();
		sd.m2();
		sd.m3();
		System.out.println(a/sd.b);

	}

}
