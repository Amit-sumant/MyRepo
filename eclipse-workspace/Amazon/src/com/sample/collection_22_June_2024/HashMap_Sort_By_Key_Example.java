package com.sample.collection_22_June_2024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMap_Sort_By_Key_Example 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		 
	    hashmap.put(22,"A");
	    hashmap.put(55,"B");
	    hashmap.put(33,"Z");
	    hashmap.put(44,"M");
	    hashmap.put(99,"I");
	    hashmap.put(88,"X");
	    
	    System.out.println("-----------Before Sorting:-----------");
	    
	    Set set= hashmap.entrySet();
	    Iterator it = set.iterator();
	    
	    while(it.hasNext())
	    {
	    	Map.Entry pair = (Entry) it.next();
	    	System.out.print(pair.getKey() + ":");
	    	System.out.println(pair.getValue() + ":");
	    }
	    
	    TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(hashmap);
	    System.out.println("-----------After Sorting-----------");
	    
	    Set set1 = treeMap.entrySet();
	    Iterator it1 = set1.iterator();
	    
	    while(it1.hasNext())
	    {
	    	Entry pair1 = (Entry) it1.next();
	    	System.out.print(pair1.getKey() + ":");
	    	System.out.println(pair1.getValue() + ":");
	    }

	}
	
	public static void HashMapSortByValueExample()
	{
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		 
	    hashmap.put(22,"A");
	    hashmap.put(55,"B");
	    hashmap.put(33,"Z");
	    hashmap.put(44,"M");
	    hashmap.put(99,"I");
	    hashmap.put(88,"X");
	    
	    System.out.println("-----------Before Sorting:-----------");
	    Set set = hashmap.entrySet();
	    Iterator it = set.iterator();
	    
	    while(it.hasNext())
	    {
	    	Map.Entry pair = (Entry) it.next();
	    }
	}

}
