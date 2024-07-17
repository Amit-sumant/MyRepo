package com.java.LatestCollection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SWAP_Element {

	public static void main(String[] args) 
	{
		List<Object> list=new ArrayList<>();
		list.add(1);
		list.add("Brian");

		
		for(Object o : list)
		{
			System.out.println("Actual - " + o);
		}
		
		Collections.swap(list, 1, 0);
		
		System.out.println("After SWap");
		
		for(Object b : list)
		{
			System.out.println("Swap - " + b);
		}

	}

}
