package com.java.New_ThreadSafe_Synchronized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList_ThreadSafe {

	public static void main(String[] args)
	{
		List<String> namelist = Collections.synchronizedList(new ArrayList<String>()); //its returning List of String 
		
		namelist.add("Java");
		namelist.add("C++");
		namelist.add("C#");
		namelist.add("Selenium Automation");
		namelist.add("SQL");
		
		//to fetch / traverse the values from list -- we have to use explicit Synchronization
		
		synchronized (namelist)
		{
			java.util.Iterator<String> it= namelist.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}	

	}

}
