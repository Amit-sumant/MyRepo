package com.sample.collection_22_June_2024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Iterate_HashSet {

	public static void main(String[] args) 
	{
		HashSet<Integer> set=new LinkedHashSet<>();
		
		set.add(11);
		set.add(21);
		set.add(31);
		set.add(41);
		set.add(51);
		set.add(61);
		
		Iterator<Integer> it = set.iterator();
		System.out.println(it);
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		//-----------------
		
		System.out.println("-----------Using For Loop-----------");
		
		set.add(71);
		set.add(81);
		set.add(91);
		set.add(101);
		set.add(111);
		set.add(121);
		
		
		for(Integer ii : set)
		{
			System.out.println(ii);
		}
		
		System.out.println("-----------Using Contains-----------");
		
		if(set.contains(151) || set.contains(131))
		{
			System.out.println("Your Hashset is Present - > ");
			
		}
		else
			System.out.println("Your Hashset is Not Present - > ");

	}

}
