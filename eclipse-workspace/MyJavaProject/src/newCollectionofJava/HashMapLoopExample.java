package newCollectionofJava;

import java.util.HashMap;

public class HashMapLoopExample 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hmp=new HashMap<>();
		
		hmp.put(1, "Mumbai");
		hmp.put(2, "Delhi");
		hmp.put(3, "Banglore");
		hmp.put(4, "Chennai");
		hmp.put(5, "Kolkata");
		hmp.put(6, "Shilong");
		
		System.out.println("---Using each loop iterate---");
		
		for(Object obj : hmp.keySet())
		{
			System.out.println("Key - " + obj + " " + "Value - " + hmp.get(obj));
		}
		
		//Iterating or looping Map Using keySet() and iterator
		System.out.println("Iterating or looping Map Using keySet() and iterator");
		
		HashMap<Object, Object> hmp1=new HashMap<>();
		
		hmp1.put("USA", "Washington");
		hmp1.put("Keral","Thiruananthpuram");
		hmp1.put("Gujrath", "GandhiNagar");
		hmp1.put("Odisha", "Bhuvaneshwar");
		hmp1.put("Andhra Pradesh","Vishakhapattanam");
		hmp1.put("Himachal Pradesh", "Shimla");
		
		 // Iterating or looping using keySet() method
		
		
		
	}

}
