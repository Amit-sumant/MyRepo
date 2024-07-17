package com.java.General;

public class General_5 
{

	public static void main(String[] args) 
	{
		int num = 852699;
		int even=0;
		int odd=0;
				
		while(num>0)
		{
			int rem = num%10;
			if(rem%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			
			num = num/10;
		}
		
		System.out.println(even);
		System.out.println(odd);
	}

}
