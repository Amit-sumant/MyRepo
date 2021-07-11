package javaBasic;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Concept {

	public static void main(String[] args) {
		
		LinkedList<String> str=new LinkedList<String>();
		str.add("Hello");
		str.add("This");
		str.add("is");
		str.add("Collection");
		
		//traversing reverse oredr
		Iterator<String> i=str.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
