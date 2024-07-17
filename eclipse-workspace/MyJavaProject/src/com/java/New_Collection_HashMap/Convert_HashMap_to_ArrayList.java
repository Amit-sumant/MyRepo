package com.java.New_Collection_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Convert_HashMap_to_ArrayList {

	public static void main(String[] args) 
	{
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		map.put("ISRO", 100000);
		map.put("NASA", 50000);
		map.put("Google", 260000);
		map.put("Microsoft", 300000);
		map.put("Amazon", 80000);
		
		System.out.println(map.size());
		System.out.println("--------------------------------------");
		
		Iterator it= map.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + " || Value -> " + pair.getValue());
		}
		
		// Convert HashMap keys to ArrayList
		
		System.out.println("-------------------------------------------------------");
		
		List<String> coname=new ArrayList<String>(map.keySet());
		
		for(String t : coname)
		{
			System.out.println(t);
		}
		
		// Convert HashMap values to ArrayList
		
				System.out.println("-------------------------------------------------------");
				
		List<Integer> val=new ArrayList<Integer>(map.values());
		
		for(Integer v : val)
		{
			System.out.println(v);
		}

	}

}
