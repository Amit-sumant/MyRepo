package com.sample.startpattern;

public class StartPattern3 {

	public static void main(String[] args) 
	{
		// A ascii value is 65 
		
		int alpha=65;
		
		for(int i=0;i<=6;i++)
		{
			for(int j=0; j<=i; j++)
			{
				//System.out.print((char)alpha + " ");
				System.out.print((char)(alpha+j) + " ");
			}
			//alpha++;
			
			System.out.println();
		}

	}

}
