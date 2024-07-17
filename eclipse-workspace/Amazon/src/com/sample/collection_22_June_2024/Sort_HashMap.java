package com.sample.collection_22_June_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Sort_HashMap 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> map=new HashMap<>();
		
		map.put(5, "UBS");
		map.put(3, "Amazon");
		map.put(1, "Google");
		map.put(4, "Morgan Stanley");
		map.put(2, "Facebook");

		System.out.println("--------Before Sort---------");

		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();

		while(it.hasNext())
		{
			Entry<Integer, String> pair = it.next();
			System.out.println(pair);
		}

System.out.println("--------After Sort---------");
		
		ArrayList<Integer> arrList=new ArrayList<>(map.keySet());
		
		Collections.sort(arrList);
		
		for(Integer arr : arrList)
		{
			System.out.println("Key -> " + arr + " || Value -> " + map.get(arr));
		}
	}
}