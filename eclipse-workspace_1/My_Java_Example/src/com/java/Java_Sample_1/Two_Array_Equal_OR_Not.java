package com.java.Java_Sample_1;

import java.util.Arrays;

public class Two_Array_Equal_OR_Not 
{

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9};
		int b[] = {1,2,3,4,5,6,7,8,9};
		
		boolean status = Arrays.equals(a, b);
		
		if(status==true)
		{
			System.out.println("Arrays Same");
		}
		else
		{
			System.out.println("Arrays Not Same");
		}
	}

}
