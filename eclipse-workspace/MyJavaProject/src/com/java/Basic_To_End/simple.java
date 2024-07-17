package com.java.Basic_To_End;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class simple 
{

	public static void main(String[] args) 
	{
		//find 2nd largest number
		
		/*int a[] = {1,2,6,5,8,3,4};
		
		Arrays.sort(a);
		
		System.out.println(a[a.length-2]);*/
		
		 List<Integer> v = new ArrayList<>(Arrays.asList(36, 36, 12, 35, 1, 10, 34, 34, 1));
		 Set<Integer> s = new TreeSet<>(v);
		 
		 for(int val : s)
		 {
			 v.add(val);
		 }
		
		int newsize = v.size();
		
		System.out.println(v.get(newsize-2));
		
		System.out.println("--------------------------");
		
		largestArray();

	}
	
	public static void largestArray()
	{
		int arr[] = {9,2,7,4,5,6,1};
		int max=0;
		
		int len = arr.length;
		
		for(int i=0;i<len;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.println(max);
	}

}
