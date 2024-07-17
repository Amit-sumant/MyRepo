package com.java.General;

public class Compare_Two_Int 
{
	public static void arrySum()
	{
		int a[]= {5,4,5,6,8,9};
		int sum = 0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Your array total -> " + sum);
	}

	public static void main(String[] args) 
	{
		arrySum();

	}

}
