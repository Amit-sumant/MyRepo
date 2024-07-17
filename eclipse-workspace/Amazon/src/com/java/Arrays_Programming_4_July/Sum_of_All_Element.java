package com.java.Arrays_Programming_4_July;

public class Sum_of_All_Element 
{

	public static void main(String[] args) 
	{
		int arr[] = {2,3,4,5,6,7,8,9};
		int sum=0;
		
		int len = arr.length;
		
		for(int i=1;i<len;i=i+2)
		{
			
			System.out.print(sum = sum + arr[i]);
			System.out.print(" ");
		}
	}

}
