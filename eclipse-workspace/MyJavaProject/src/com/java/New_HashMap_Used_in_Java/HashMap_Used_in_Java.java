package com.java.New_HashMap_Used_in_Java;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap_Used_in_Java {

	public static void main(String[] args) 
	{
		HashMap<Integer, Employee> hmap=new HashMap<Integer, Employee>();
		
		Employee e1=new Employee("Arnav", 1, "Sky");
		Employee e2=new Employee("Tanush", 2, "Earth");
		Employee e3=new Employee("Srinika", 3, "Water");
		Employee e4=new Employee("Anvi", 4, "Fire");
		Employee e5=new Employee("Aaryana", 5, "Air");
		
		hmap.put(1, e1);
		hmap.put(2, e2);
		hmap.put(3, e3);
		hmap.put(4, e4);
		hmap.put(5, e5);
		
		//how to iterate or traverse
		
		for(Entry<Integer, Employee> e : hmap.entrySet())
		{
			int key = e.getKey();
			Employee val = e.getValue();
			System.out.println(key + " Info ");
			System.out.println(val.name + " " + val.age + " " + val.dept);
			
		}
	}

}
