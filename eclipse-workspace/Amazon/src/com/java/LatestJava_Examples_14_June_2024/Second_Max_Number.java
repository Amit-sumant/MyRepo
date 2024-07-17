package com.java.LatestJava_Examples_14_June_2024;

import java.util.Arrays;

public class Second_Max_Number 
{

	public static void main(String[] args) 
	{
		int a[] = {50,10,20,60,90,100,200,150,70};
		
		int len = a.length;
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]>a[j])
				{
					int tmp = a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		System.out.println("Your second max number is - > " + a[len-2]);
		
		findSecondMax();

	}
	
	public static void findSecondMax()
	{
		int a[] = {50,10,20,60,90,100,200,160,70,200};
		
		int len = a.length;
		
		Arrays.sort(a);
		
		System.out.println(a[len-2]);
	}

}
