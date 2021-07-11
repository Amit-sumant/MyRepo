package javaBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MyArrayListProg 
{

	public static void main(String[] args) 
	{
		
		//Using ArrayList
		ArrayList<Object> list=new ArrayList<Object>();
		list.add("Amit");
		list.add("Learning");
		list.add("Java");
		list.add(1);
		
		//String s=(String)list.get(1);
		//System.out.println("Element is " + s);
		
		Iterator<Object> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Using Map Interface
		System.out.println("*******************************");
		
		Map<Object,Object> mp=new HashMap<>();
		mp.put(1, "Amit");
		mp.put(2, "Arnav");
		mp.put(3, "Ashwini");
		mp.put(4, "Hello");
		
		/*Iterator<Object> itr1=mp.values().iterator();
		while(itr1.hasNext())
		{
			System.out.println("This map is " + itr1.next());
		}*/
		
		Iterator<Object> itr1=mp.keySet().iterator();
		while(itr1.hasNext())
		{
			Object key=itr1.next();
			System.out.println(key + " " + mp.get(key));
			//System.out.println(itr1.next());
		}
		
		
	}
	
}
