package com.sample.collection_22_June_2024;

import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMap {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "AA");
		map1.put(3, "B");
		
		HashMap<Integer, String> map2=new HashMap<Integer, String>();
		map2.put(1, "A");
		map2.put(2, "AA");
		map2.put(3, "B");
		
		HashMap<Integer, String> map3=new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "AA");
		map3.put(3, "B");
		map3.put(4, "BB");
		
		//combine the key usinf hashset
		HashSet<Integer> hs1=new HashSet<Integer>(map1.keySet());
		//add the keyset from map3
		hs1.addAll(map3.keySet());
		hs1.removeAll(map1.keySet());
		System.out.println(hs1);
		
	}

}
