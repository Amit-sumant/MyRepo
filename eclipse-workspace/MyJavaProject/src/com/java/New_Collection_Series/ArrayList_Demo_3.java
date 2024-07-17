package com.java.New_Collection_Series;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList_Demo_3 {

	public static void main(String[] args) 
	{
		// List with other Collection
		
		ArrayList<Integer> ar=new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		
		System.out.println(ar);
		
		//using iterator
		System.out.println("-------------------");
		ArrayList<Integer> ar1=new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,70,80,90,100));
		
		Iterator<Integer> it= ar1.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}

	}

}