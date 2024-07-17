package com.java.Java_Sample_1;

public class Prime_Number {

	public static void main(String[] args) 
	{
		int num= 8;
		int cnt=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					System.out.println(cnt++);
				}
			}
			if(cnt==2) 
			{
				System.out.println("Prime Number");
			}
			else
			{
				System.out.println("Not Prime Number");
			}
		}
		else
		{
			System.out.println("Not Palindrome Num - " + num);
		}
		

	}

}
