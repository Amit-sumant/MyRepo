package com.java.New_ThreadSafe_Synchronized;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Copy_on_Write_Array_List {

	public static void main(String[] args) 
	{
		//copyOnWriteArrayList -- its a class. THread Safe / synchronized already
		
		CopyOnWriteArrayList<String> cpty=new CopyOnWriteArrayList<String>();
		
		//now add values
		
		cpty.add("Oracle");
		cpty.add("Java Script");
		cpty.add("AWS");
		cpty.add("C#.net");
		cpty.add("Python");
		
		//now to iterate
		
		 Iterator<String> itr= cpty.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }

	}

}
