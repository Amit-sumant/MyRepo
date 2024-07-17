package com.java.New_Collection_HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class Missing_Key_HashMap {

	public static void main(String[] args) 
	{
		HashMap<String, String> mp=new HashMap<String, String>();
		
		mp.put("Arnav", "ISRO");
		mp.put("Aaryana", "Microsoft");
		mp.put("Srinika", "Google");
		mp.put("Tanush", "Europien Union");
		mp.put("Anvi", "NASA");
		mp.put("Divyesh", "HAL");
		mp.put("SWara", "Amazon");
		mp.put("Sharvi", "Facebook");
		mp.put("Sri", "BMW");
		
		HashMap<String, String> mp1=new HashMap<String, String>();
		
		mp1.put("Arnav", "ISRO");
		mp1.put("Aaryana", "Microsoft");
		mp1.put("Srinika", "Google");
		mp1.put("Tanush", "Europien Union");
		mp1.put("Anvi", "NASA");
		mp1.put("Divyesh", "HAL");
		mp1.put("SWara", "Amazon");
		mp1.put("Sharvi", "Facebook");
		
		
		//so first combine the keys from both Hashmap using hash set
		
		HashSet<String> combinekey=new HashSet<>(mp.keySet());
		
		//add the key from mp1
		combinekey.addAll(mp.keySet());
		combinekey.removeAll(mp1.keySet());
		
		System.out.println(combinekey);
		

	}

}
