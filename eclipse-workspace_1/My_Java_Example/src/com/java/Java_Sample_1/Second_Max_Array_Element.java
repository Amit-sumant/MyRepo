package com.java.Java_Sample_1;

import java.util.Arrays;

public class Second_Max_Array_Element {

	public static void main(String[] args) 
	{
		int arr[] = {21,22,26,27,15,18};
		int max=0; int max1=0; int temp;
		
		int arlen = arr.length;
		
		for(int i=0;i<arlen;i++)
		{
			if(max<arr[i])
			{
				max1 = max;
				max=arr[i];
			}
		}
		
		for(int i=0;i<arlen;i++)
		{
			for(int j=i+1;j<arlen;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(max1);
		
		System.out.println("-----------This is Using Another Method-----------");
		secondMax();
		
	}
	
	public static void secondMax()
	{
		int arr[] = {1,11,5,7,9,3,19,18,25};
		
		Arrays.sort(arr);
		
		int arlen = arr.length;
		
		System.out.println(arr[arlen-2]);
	}

}
