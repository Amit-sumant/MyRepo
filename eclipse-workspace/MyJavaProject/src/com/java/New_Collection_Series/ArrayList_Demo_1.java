package com.java.New_Collection_Series;

import java.util.ArrayList;

public class ArrayList_Demo_1 {

	public static void main(String[] args) 
	{
		// ArrayList
		
		ArrayList<Object> ar=new ArrayList<>();
		
		ar.add(10);
		ar.add("String");
		ar.add(4.5);
		ar.add(20);
		ar.add("Java");
		ar.add('m');
		ar.add("AM");
		
		System.out.println(" " + ar);
		
		
		
		System.out.println("find length - " + ar.size());
		
		System.out.println("Heighst Value -> " + (ar.size()-1));
		
		//virtual capacity of ArrayList is 10
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println("Your Size -> " + ar.get(i));
		}

	}

}
