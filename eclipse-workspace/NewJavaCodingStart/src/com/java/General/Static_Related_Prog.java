package com.java.General;

public class Static_Related_Prog 
{
	//q1 . Explain Static Block
	static //static block execute first and we can have number of static block
	{
		System.out.println("This is Static");
	}
	static //static block execute first
	{
		System.out.println("This is Static 1");
	}

	public static void main(String[] args) 
	{
		System.out.println("This is Main");
		test();
		
		Static_Related_Prog sconst=new Static_Related_Prog();

	}
	
	//Q2 - How can we run a java prog without making any object
	
	static //static block execute first and we can have number of static block
	{
		System.out.println("This is Static ....3 ");
	}
	
	public static void test()
	{
		System.out.println("This is Test");
	}
	
	//Q3 - How can we create object if we make the constructor private?
	
	private Static_Related_Prog()
	{
		int age=30;
		System.out.println(age);
	}
}
