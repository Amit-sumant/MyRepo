package com.java.Basic_To_End;

public class Sample1_Java 
{
	int a;
	int b;
	
	/*void sum(int x, int y)
	{
		a=x;
		b=y;
	}*/
	
	void sum(int a, int b) 
	{
		this.a = a; // so here this belomg to class or instance variable
		this.b = b;
		
	}
	
	void sum1()
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) 
	{
		Sample1_Java sj=new Sample1_Java();
		sj.sum(10, 50);
		sj.sum1();

	}

}
