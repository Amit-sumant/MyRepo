package com.java.New_Collection_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hash_Demo_2_Using_entrySet {

	public static void main(String[] args) 
	{
		HashMap<String, String> mp=new HashMap<String, String>();
		
		mp.put("Arnav", "ISRO");
		mp.put("Srinika", "Google");
		mp.put("Tanush", "Europien Union");
		mp.put("Anvi", "NASA");
		mp.put("Divyesh", "HAL");
		mp.put(null, "Microsoft");
		mp.put("SWara", "Amazon");
		mp.put("Sharvi", "Facebook");
		mp.put("Sri", null);

		
		System.out.println(mp.size());
		
		//how to Iterate
		
		Iterator<Entry<String, String>> it= mp.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<String, String> itr = it.next();
			System.out.println("Your Key val -> " + itr.getKey() + " || Your Value -> " + itr.getValue());
		}
		
		
		//using Lambda
		System.out.println("-----------------------Using Lambda-----------------------------");
		
		mp.forEach((k,v) -> System.out.println("Key -> " + k + " || Value -> " + v));
		
		

	}

}
