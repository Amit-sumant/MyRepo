package com.java.New_HashMap_Used_in_Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Convert_Hashmap_to_ArrayList {

	public static void main(String[] args) 
	{
		// convert hashmap to arraylist
		
		HashMap<String, Integer> map=new HashMap<>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		
		System.out.println(map.size());
		
		//iterate
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pairs = (Map.Entry) it.next();
			Object key = pairs.getKey();
			Object val = pairs.getValue();
			
			System.out.println("Key -> " + key + " " + "Value -> " + val);
		}
		
		//now convert Keys into Arraylist
		
		List<String> list=new ArrayList<>(map.keySet());
		
		for(String strlist : list)
		{
			System.out.println(strlist);
		}
		
		//now convert Values into Arraylist
		List<Integer> listvalues=new ArrayList<Integer>(map.values());
		
		for(Integer ival : listvalues)
		{
			System.out.println(ival);
		}

	}

}
