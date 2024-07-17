package com.java.Arrays_Programming_4_July;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Majaority_Array 
{

	public static void main(String[] args) 
	{
		int arr[] = {2,3,3,3,4,5,6,6,7,7,7,8,9,9,10,54,68,7,8};
		int val;
		
		int len = arr.length;
		
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
		
		for(int i=0;i<len;i++)
		{
			if(map.get(arr[i])!=(null))
			{
				val = map.get(arr[i]);
				map.put(arr[i], val + 1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		System.out.println(map.toString() + " ");
		
		System.out.println("Only Duplicate Arrays using Iterator");
		
		Iterator<Integer> it =  map.keySet().iterator();
		
		while(it.hasNext())
		{
			int key=it.next();
			if(map.get(key)>1)
			{
				System.out.println(key + " - " + map.get(key));
			}
		}
		
		//using Keyset
		System.out.println("Using Keyset without Iteratoes");
		
		Set<Integer> sit = map.keySet();
		
		for(int key1 : sit)
		{
			if(map.get(key1)>1)
			{
				System.out.println(key1 + " - " + map.get(key1));
			}
		}
		
	}

}
