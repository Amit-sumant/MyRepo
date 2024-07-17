package com.java.New_Collection_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Demo_2 {

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<>();
		
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		
		System.out.println(ll.size());
		System.out.println(ll.get(4));
		
		ll.add(5, "F");
		System.out.println(ll.size());
		
		System.out.println("---------------------------------------------------------------");
		
		LinkedList<String> ll2=new LinkedList<String>();
		
		ll2.add("V");
		ll2.add("W");
		ll2.add("X");
		ll2.add("Y");
		ll2.add("Z");
		
		ll.addAll(ll2);
		System.out.println(ll);
		
		//Traverse
		System.out.println("-------------------------------------------------------------");
		
		Iterator<String> it = ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
