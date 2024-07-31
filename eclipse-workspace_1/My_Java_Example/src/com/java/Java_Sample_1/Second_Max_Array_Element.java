package com.java.Java_Sample_1;

import java.util.Arrays;

public class Second_Max_Array_Element {

	public static void main(String[] args) 
	{
			int arr[] = {21,22,100,27,28,15,18,99,555};
			int max=arr[0]; int max1=0; int temp;
		
				
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Second Largest - " + arr[arr.length-2]);
		
		System.out.println("-----------This is Using Another Method-----------");
		
		//secondMax();
		
	}
	
	public static void secondMax()
	{
		int arr[] = {1,11,5,7,9,3,19,18,25};
		
		Arrays.sort(arr);
		
		int arlen = arr.length;
		
		System.out.println(arr[arlen-2]);
	}

}
