package com.java.New_Collection_HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap_Demo_1 {

	public static void main(String[] args) 
	{
		//HashMap stores the values in form of Key and Value format
		//Duplicate values are not allowed, but if we entered then latest values will be display.
		//It accept only one null Key and Multiple null values
		//it is not sysncronized
		// HashMap is non synchronized but Hash Table is synchronized
		
		HashMap<String, String> mp=new HashMap<String, String>();
		
		mp.put("Arnav", "ISRO");
		mp.put("Srinika", "Google");
		mp.put("Tanush", "Europien Union");
		mp.put("Anvi", "NASA");
		mp.put("Divyesh", "HAL");
		mp.put(null, "Microsoft");
		mp.put(null, "Amazon");
		mp.put("Sharvi", null);
		mp.put("Sri", null);
		
		System.out.println(mp.size());
		
		//System.out.println(mp.get("sharvi"));
		
		// how to iterate
		
		Iterator<String> it = mp.keySet().iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			String val = mp.get(key);
			System.out.println("Your Key - " + key + " || your value - " + val);
		}
		

	}

}
