package com.java.Arrays_Programming_4_July;

import java.util.ArrayList;

public class Find_Intersection_of_an_Array {

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4};
		int arr1[] = {4,5,6,1};
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			ar.add(arr[i]);
		}
		for(int i=0;i<arr1.length;i++)
		{
			if(ar.contains(arr1[i]))
			{
				System.out.println("Your Intersection Array is - " + arr1[i]);
			}
		}

	}

}
