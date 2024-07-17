package com.sample.collection_22_June_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class HashMap_Example {

	public static void main(String[] args) 
	{
		//Conver Hashmap to Arrylist
		HashMap<Integer, String> map=new HashMap<>();
		
		map.put(1, "Google");
		map.put(2, "Facebook");
		map.put(3, "Amazon");
		map.put(4, "Morgan Stanley");
		map.put(5, "UBS");
		
		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<Integer, String> pair = it.next();
			System.out.println(pair.getKey() + " " + pair.getValue());
		}
		
		System.out.println("-----------String Values-----------");
		//convert into Arrylist now using 
		List<String> list = new ArrayList<String>(map.values());
		
		for(String l : list)
		{
			System.out.println(l);
		}
		
		System.out.println("-----------Integer Values-----------");
		
		List<Integer> list1 = new ArrayList<Integer>(map.keySet());
		
		for(Integer ll : list1)
		{
			System.out.println(ll);
		}
		
		
	}

}
