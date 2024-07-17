package com.java.Arrays_Programming_4_July;

public class Addition_of_Array_Even_Odd 
{

	public static void main(String[] args) 
	{
		int arr[] = {11,20,31,40,51,60,71,80,91};
		int sum = 0;
		int sum1 = 0;
		
		int len = arr.length;
		
		for(int i=0;i<len;i++)
		{
			if(arr[i]%2==0)
			{
				sum = sum + arr[i];
				//System.out.print(" ");
			}
			else
			{
				sum1 = sum1 + arr[i];
				//System.out.print(" ");
					
			}
		}
		
		System.out.println("Even Number sum of-> " + sum);
		System.out.println("Odd Number sum of -> " + sum1);
		
	}

}
