package com.java_Factorial_Numbers_Prog;

import java.util.Scanner;

public class Factorial_Scanner {

	public static void main(String[] args) 
	{
		// Using Scanner
		long fact=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Factorial Number");
		
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			System.out.print(i);
			
			if(i<=num-1)
			{
				System.out.print("*");
			}
			fact=fact*i;
		}
		
		System.out.println();
		System.out.println("Your Fact Value becomes -> " + fact);

	}

}
