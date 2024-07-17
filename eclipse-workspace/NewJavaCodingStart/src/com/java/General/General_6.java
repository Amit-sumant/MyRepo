package com.java.General;

public class General_6 
{
	

	public static void main(String[] args) 
	{
		int n=0; int n1=1;
		int sum=0;
		
		System.out.println(n + " " + n1);
		
		for(int i=2;i<=10;i++)
		{
			sum = n+n1;
			System.out.print(" " + sum);
			n=n1;
			n1=sum;
			
			System.out.println("-------------------------------------------------------");
			
			
		}

	}

}
