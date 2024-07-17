package com.java.Sum_of_Digit;

public class Sum_of_Digit_Number 
{

	public static void main(String[] args) 
	{
		int num = 896541232;
		int cnt=0;
		int sum=0;
		
		
		while(num>0)
		{
			sum = sum + num%10;
			num = num/10;
			cnt++;
		}
		
		System.out.println("Your Sum of Digit Number becomes -> " + sum);

	}

}
