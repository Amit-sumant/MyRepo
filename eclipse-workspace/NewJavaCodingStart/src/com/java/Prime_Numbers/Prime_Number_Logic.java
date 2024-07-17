package com.java.Prime_Numbers;

public class Prime_Number_Logic {

	public static void main(String[] args) 
	{
		//Prime num means number which is more than one and not divided by any numbers
		
		int num=5;
		int cnt=0;
		
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
				{
					cnt++;
				}
				if(cnt==2)
				{
					System.out.println("Number is Prime");
				}
				else
				{
					System.out.println("Number is Not Prime");
				}
			}
			
		}
		else
		{
			System.out.println("Number is not Prime");
		}

	}

}
