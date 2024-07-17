package com.java_Factorial_Numbers_Prog;

public class Find_Sum_of_Elements_Array {

	public static void main(String[] args) 
	{
		int a[] = {9,10,15,8,9,9};
		int sum=0;
		
		/*
		 * for(int i=0;i<=a.length-1;i++) { sum = sum + a[i]; }
		 */
		
		for(int val:a)
		{
			sum = sum + val;
		}
		
		System.out.println(sum);

	}

}
