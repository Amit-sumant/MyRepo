package com.java.Fibonanci;

public class Fibonanci_Series {

	public static void main(String[] args) 
	{
		int n1=0;
		int n2=1;
		int sum=0;
		
		System.out.println("Your Initial Number -> " + n1 + " And THis is is 2nd -> " + n2);
		
		for(int i=2; i<10; i++)
		{
			sum = n1+n2;
			System.out.println("Your Fibo number -> " + sum);
			n1=n2;
			n2=sum;
		}

	}

}
