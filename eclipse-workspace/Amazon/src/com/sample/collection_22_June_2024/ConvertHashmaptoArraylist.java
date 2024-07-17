package com.sample.collection_22_June_2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ConvertHashmaptoArraylist {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "AA");
		map.put(3, "AAA");
		map.put(4, "AAAA");
		map.put(5, "AAAAA");
		
		System.out.println("Total Size -> " + map.size());
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}
		
		//now convert hashmap to arrayList
		List<Integer> maptoarraylist=new ArrayList<Integer>(map.keySet());
		
		for(Integer itr : maptoarraylist)
		{
			System.out.println(itr);
		}
		
		//now convert hashmap values to arrayList
		List<String> maptosting=new ArrayList<String>(map.values());
		
		for(String str : maptosting)
		{
			System.out.println(" ===> " + str);
		}
		

	}

}
