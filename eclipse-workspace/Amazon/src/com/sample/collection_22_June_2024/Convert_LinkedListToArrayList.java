package com.sample.collection_22_June_2024;

import java.util.ArrayList;
import java.util.LinkedList;

public class Convert_LinkedListToArrayList 
{

	public static void main(String[] args) 
	{
		LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("Mango");
	    linkedlist.add("Banana"); 
	    linkedlist.add("Pear");
	    linkedlist.add("Apple");
	    linkedlist.add("Orange");
	    
	 // Converting LinkedList to ArrayList
	    ArrayList<String> arrList=new ArrayList<String>(linkedlist);
	    
	    for(String str : arrList)
	    {
	    	System.out.println(str);
	    }

	}

}
