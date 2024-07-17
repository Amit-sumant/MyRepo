package com.sample.collection_22_June_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Threadsafeconcept {

	public static void main(String[] args) 
	{
		//we need to use CopyonArrayList method which is thread safe
		
		CopyOnWriteArrayList<String> str=new CopyOnWriteArrayList<String>();
		
		str.add("Arnav");
		str.add("Tanush");
		str.add("Srinika");
		str.add("Divyesh");
		str.add("Swara");
		str.add("Anvi");
		str.add("Sharvi");
		
		Iterator<String> it = str.iterator();
		
		while(it.hasNext())
		{
			System.out.println("--> " + it.next());
		}
		
		
		System.out.println("---------------------------------------------------------------------------------");
		
		//Collection.synchronizedList() - returns synchronized list
		
		List<String> lststr =  Collections.synchronizedList(new ArrayList<String>());
		
		lststr.add("Panji");
		lststr.add("Ratnagiri");
		lststr.add("Madgaon");
		lststr.add("Sindhudurga");
		lststr.add("Amboli");
		lststr.add("Mahabaleshwar");
		lststr.add("Guhagar");
		
		synchronized(lststr)
		{
			Iterator<String> str1 = lststr.iterator();
			
			while(str1.hasNext())
			{
				System.out.println("--> " + str1.next());
			}
		}

	}

}
