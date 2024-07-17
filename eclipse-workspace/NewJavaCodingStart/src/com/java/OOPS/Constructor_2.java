package com.java.OOPS;

public class Constructor_2 extends Constructor_1
{
	public Constructor_2()
	{
		super();
	}
	
	public Constructor_2(int i)
	{
		super(i);
	}
	
	public Constructor_2(int i, int j)
	{
		System.out.println(i + " " + j);
	}

	public static void main(String[] args) 
	{
		Constructor_2 ct=new Constructor_2();
		Constructor_2 ct1=new Constructor_2(10);
		Constructor_2 ct2=new Constructor_2(10,20);
	}

}
