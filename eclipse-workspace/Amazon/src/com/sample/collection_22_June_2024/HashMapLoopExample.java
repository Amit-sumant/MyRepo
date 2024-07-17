package com.sample.collection_22_June_2024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapLoopExample 
{

	public static void main(String[] args) 
	{
		System.out.println("Iterating or looping Map Using keySet() and foreach loop"); 
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
	    hashmap.put("Key1", "Value1");
	    hashmap.put("Key2", "Value2");
	    hashmap.put("Key3", "Value3");
	    hashmap.put("Key4", "Value4");
	    hashmap.put("Key5", "Value5");
	    
	    for(String map : hashmap.keySet())
	    {
	    	System.out.println("Key -> " + map + " | Value -> " + hashmap.get(map));
	    }
	    
	    System.out.println("Iterating or looping Map Using keySet() and iterator");
	    
	    HashMap<String, String> hashmap1 = new HashMap<String, String>();
	    hashmap1.put("Key6", "Value6");
	    hashmap1.put("Key7", "Value7");
	    hashmap1.put("Key8", "Value8");
	    hashmap1.put("Key9", "Value9");
	    hashmap1.put("Key10", "Value10");
	    
	    Set<String> keyset = hashmap1.keySet();
	    Iterator<String> it = keyset.iterator();
	    
	    while(it.hasNext())
	    {
	    	String str = it.next();
	    	System.out.println("Key -> " + str + " Value -> " + hashmap1.get(str));
	    }
	    
	    //Iterating or Looping Map in Java using entrySet() and for each Loop
	    System.out.println("Iterating or Looping Map in Java using entrySet() and for each Loop");
	    
	    HashMap<String, String> hashmap2 = new HashMap<String, String>();
	    hashmap2.put("Key 11", "Value 11");
	    hashmap2.put("Key 12", "Value 12");
	    hashmap2.put("Key 13", "Value 13");
	    hashmap2.put("Key 14", "Value 14");
	    hashmap2.put("Key 15", "Value 15");
	    
	    Set<Entry<String, String>> map2 =  hashmap2.entrySet();
	    
	    for(Entry entry : map2)
	    {
	    	System.out.println("Map -> " + entry.getKey() + " Value -> " + entry.getValue());
	    }

	}

}
