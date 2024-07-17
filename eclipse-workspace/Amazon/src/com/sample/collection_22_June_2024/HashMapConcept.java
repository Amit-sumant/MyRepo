package com.sample.collection_22_June_2024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapConcept {
	
	public static void main(String args[])
	{
		//no order and no indexing
		//store value in Ket Value format
		//key can not be duplicate
		//can store multiple null value but only one null key
		
		HashMap<String , String> countrycity=new HashMap<String, String>();
		
		countrycity.put("Bharat", "New Delhi");
		countrycity.put("Australia", "Perth");
		countrycity.put("Israel", "Jerusalem");
		countrycity.put("Switzerland", "Zurich");
		countrycity.put(null, "Welington");
		countrycity.put(null, "Paris");
		countrycity.put("Holand", null);
		
		System.out.println("Your Hash Map - > " + countrycity.get("Bharat"));
		System.out.println("Your Hash Map - > " + countrycity.get(null));
		System.out.println("Your Hash Map - > " + countrycity.get("Holand"));
		
		//How to iterate hashmap as this not maintain an order
		
		System.out.println("*****************************Keyset*************************************************");
		
		Iterator<String> itrset= countrycity.keySet().iterator();
		
		while(itrset.hasNext())
		{
			String key = itrset.next();
			String value = countrycity.get(key);
			
			System.out.println("Key -> " + key + " Value -> " + value);
		}
		
		
		//How to iterate hashmap using entryset
		System.out.println("*****************************Entryset*************************************************");
		
		Iterator<Entry<String, String>> entry = countrycity.entrySet().iterator();
		
		while(entry.hasNext())
		{
			Entry<String, String> ent = entry.next();
			System.out.println("Key --> " + ent.getKey() + " | Value --> " + ent.getValue());
		}
		
	}

}
