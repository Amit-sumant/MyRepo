package com.java.New_Collection_HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_AND_SynchronizedMap 
{

	public static void main(String[] args) 
	{
		// synchronized Map
		
		Map<String, String> mp=new HashMap<>();
		
		mp.put("1", "A");
		mp.put("2", "B");
		mp.put("3", "C");
		mp.put("4", "D");
		
		//to create synchronized map use class synchronized map
		Map<String, String> synmp = Collections.synchronizedMap(mp);
		
		System.out.println(synmp);
		
		//Concurrent HashMap
		System.out.println("----------------------------Concurrent HashMap-----------------------------------");
		
		//concurrent hash map does not throw any concurrentModificationException
		
		ConcurrentHashMap<Integer, String> chmp=new ConcurrentHashMap<>();
		
		chmp.put(1, "Panjim");
		chmp.put(2, "Madgaon");
		chmp.put(3, "Ratnagiri");
		chmp.put(4, "Redi");
		chmp.put(5, "Veling");
		chmp.put(6, "Guhagar");
		
		System.out.println(chmp.get(5));
		
	}

}
