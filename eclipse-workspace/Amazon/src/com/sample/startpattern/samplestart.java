package com.sample.startpattern;

public class samplestart {

	public static void main(String[] args) 
	{
		for(int i=0; i<=5;i++) //outer loop
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=0; i<=5; i++)
		{
			for(int j=5; j>i; j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
