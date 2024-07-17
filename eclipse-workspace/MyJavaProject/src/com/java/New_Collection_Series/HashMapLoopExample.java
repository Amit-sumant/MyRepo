package com.java.New_Collection_Series;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapLoopExample 
{

	public static void main(String[] args) 
	{
		/*
		 * 1. for-each loop 
		 * 2. keyset() iterator 
		 * 3. entrySet() and for loop 
		 * 4. entrySet() and java iterator
		 */
		
		//Using for each
		
		HashMap<String, String> hmp=new HashMap<>();
		
		hmp.put("Maharashtra", "Mumbai");
		hmp.put("Karnataka", "Banglore");
		hmp.put("Keral", "Thiruananthpuram");
		hmp.put("Himachal Pradesh", "Shimla");
		hmp.put("Gomantak", "Panji");
		hmp.put("Andaman & Nikobar", "Port Blair");
		hmp.put("Andhra Pradesh", "Vishakhapattanam");
		
		System.out.println("HashMap Iterate using for each loop");
		
		for(String key : hmp.keySet())
		{
			System.out.println("Key -> " + key + " - Value -> " + hmp.get(key));
		}
		
		//Using keyset() iterator 
		System.out.println("------------------------------------------");
		System.out.println("HashMap Iterate using keyset() iterator");
		
		Set<String> keyset = hmp.keySet();
		Iterator<String> it= keyset.iterator();
		
		while(it.hasNext())
		{
			String key1 = it.next();
			System.out.println("Key is -> " + key1 + " : Value -> " + hmp.get(key1));
		}
		
		//Using keyset() iterator 
				System.out.println("------------------------------------------");
				System.out.println("HashMap Iterate using entrySet() and for loop");
				
		Set<Map.Entry<String, String>> keyentry = hmp.entrySet();
		
		for(Map.Entry<String, String> entry : keyentry)
		{
			System.out.println("Key -> " + entry.getKey() + " : Value -> " + entry.getValue());
		}
		
	}

}
