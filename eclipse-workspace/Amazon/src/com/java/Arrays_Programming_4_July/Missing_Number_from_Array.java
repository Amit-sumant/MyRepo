package com.java.Arrays_Programming_4_July;

import java.util.HashSet;

public class Missing_Number_from_Array {

	public static void main(String[] args) 
	{
		/*int arr[] = {2,4,6,7,8,10,11};
		int max=0;
		
		//int len = arr.length;
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int array : arr)
		{
			set.add(array);
			System.out.println("->" + array);
			
			if(max<array)
			{
				max = array;
			}
			
		}
		System.out.println("Largest Array " + max);
		
		
		int num = arr.length;
		
		for(int i=0;i<=max;i++)
		{
			if(!set.contains(i))
			{
				System.out.println("Missing Numbers are -> " + i);
			}
		}*/
		
		usingAnotherMethod();

	}
	
	public static void usingAnotherMethod()
	{
		int arr[] = {2,4,6,7,8,10,11};
		int max=0;
		
		int len = arr.length;
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=0;i<len;i++)
		{
			set.add(arr[i]);
			System.out.println("->" + arr[i]);
			
			if(max<arr[i])
			{
				max = arr[i];
			}
			
		}
		System.out.println("Largest Array " + max);
		
		for(int i=0;i<=max;i++)
		{
			if(!set.contains(i))
			{
				System.out.println("Missing Numbers are -> " + i);
			}
		}
	}

}
