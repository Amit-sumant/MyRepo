package com.java.New_Collection_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortByKeyExample 
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
	 
	    System.out.println("Before Sorting:");
	    Set<Entry<Integer, String>> set = hashmap.entrySet();
	    Iterator<Entry<Integer, String>> it = set.iterator();
	    
	    while(it.hasNext())
	    {
	    	Map.Entry pair = (Map.Entry) it.next();
	    	System.out.print(pair.getKey() + ":");
	    	System.out.println(pair.getValue());
	    }
	    
	    Map<Integer, String> map = new TreeMap<Integer, String>(hashmap);     
	    System.out.println("After Sorting:");
	    
	    Set<Entry<Integer, String>> set1 = map.entrySet();
	    Iterator<Entry<Integer, String>> it1 = set1.iterator();
	    
	    while(it1.hasNext())
	    {
	    	Map.Entry pair1 = it1.next();
	    	System.out.print(pair1.getKey() + ":");
	    	System.out.println(pair1.getValue());
	    }

	}

}
