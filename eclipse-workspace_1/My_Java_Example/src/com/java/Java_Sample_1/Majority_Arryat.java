package com.java.Java_Sample_1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Majority_Arryat {

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
		
		System.out.println("---Only Duplicate Arrays Displayed using ---");
		
		Set<Integer> set = map.keySet();
		
		for(Integer keyset : set)
		{
			if(map.get(keyset)>1)
			{
				System.out.println(keyset + " - " + map.get(keyset));
			}
		}
		
		System.out.println("---Only Duplicate Arrays Displayed using Iterator---");
		
		Iterator<Integer> set1 = map.keySet().iterator();
		
		while(set1.hasNext())
		{
			int key1 = set1.next();
			if(map.get(key1)>1)
			{
				System.out.println(key1 + " - " + map.get(key1));
			}
		}

	}

}
