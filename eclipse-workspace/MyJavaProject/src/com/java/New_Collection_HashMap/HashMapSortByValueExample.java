package com.java.New_Collection_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortByValueExample 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	 
		// Adding Key and Value pairs to HashMap
		hashmap.put(22, "A");
		hashmap.put(55, "B");
		hashmap.put(33, "Z");
		hashmap.put(44, "M");
		hashmap.put(99, "I");
		hashmap.put(88, "X");
		hashmap.put(11, "C");
 
		System.out.println("Before Sorting:");// TODO Auto-generated method stub
		
		Set<Entry<Integer, String>> pair = hashmap.entrySet();
		Iterator<Entry<Integer, String>> it = pair.iterator();
		
		while(it.hasNext())
		{
			Entry<Integer, String> getval = it.next();
			System.out.print(getval.getKey() + ":");
			System.out.println(getval.getValue());
			
		}
		
		System.out.println("After Sorting");
		
		hashmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		

	}

}
