package javaBasic;

public class PrintAlphabet 
{

	public static void main(String[] args) 
	{
		// Printing alphabet pattern like below
		/*
		 A
		 AB
		 ABC
		 ABCD
		 */
		// 65 means ASCII value of A 
		int alpha=65;
		for(int i=0;i<=5;i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print((char)(alpha + j) + " ");
			}
			System.out.println();
		}
		System.out.println("------------------ * Print-------------------------");
		
		for(int x=0; x<=5; x++)
		{
			for(int y=5; y>=x; y--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		/* "-" consider as a space
		  ---*
		  --**
		  -***
		  ****
		 */
		System.out.println("---------------- print * in opposite oredr-------------------");
		
		for (int a=0; a<=5; a++)
		{
			for (int b=4; b>=a; b--)
			{
				System.out.print(" ");
			}
			//this for loop for print *
			for (int c=1; c<=a; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
