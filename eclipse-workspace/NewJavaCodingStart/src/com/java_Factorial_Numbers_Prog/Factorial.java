package com.java_Factorial_Numbers_Prog;

public class Factorial {

	public static void main(String[] args) 
	{
		// Factorial means num is 5 then it works as 5 *4 *3 * 2 * 1
		
		int num=6;
		long fact=1; //6*5*4*3*2*1
		
		for(int i=1; i<=num; i++)
		{
			{
				System.out.print( i );
				
				if(i<=num-1)
				{
					System.out.print("*");
				}
				
			}
				fact = fact*i;
		}
		
		System.out.println();
		
		System.out.println("Your Factorial Number is -> " + fact);

	}


}
