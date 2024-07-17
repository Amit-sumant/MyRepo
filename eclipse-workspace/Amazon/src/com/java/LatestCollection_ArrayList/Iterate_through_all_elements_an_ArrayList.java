package com.java.LatestCollection_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Iterate_through_all_elements_an_ArrayList {

	public static void main(String[] args) 
	{
		List<Object> list=new ArrayList<>();
		list.add(1);
		list.add("Brian");
		list.add("USA");
		list.add(49);
		list.add("Scrum Manager");
		
		//iterate
		for(Object s : list)
		{
			System.out.println("ArrayList - " + s);
		}
		
		if(list.contains("USA"))
		{
			System.out.println("This String exist - " + list.get(2));
		}
		else
		{
			System.out.println("This String does not exist - " + list.toString());
		}

	}

}