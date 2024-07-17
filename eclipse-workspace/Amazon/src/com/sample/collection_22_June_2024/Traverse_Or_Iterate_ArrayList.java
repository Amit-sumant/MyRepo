package com.sample.collection_22_June_2024;

import java.util.ArrayList;

public class Traverse_Or_Iterate_ArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Object> list=new ArrayList<>();
		
		list.add(1);
		list.add("Rodger");
		list.add("Federer");
		list.add("Tennis");
		list.add(42);
		list.add(21);
		
		System.out.println(list.toString());
		
		for(Object obj : list)
		{
			System.out.println(obj );
		}

	}

}
