package javaBasic;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// It is similar to HashMap but it is Synchronized
		//It store the value on basis of Key and Value
		//Key is stored in the form of Object and each object have unique identifier i.e. Hashcode ---> Value
		
		Hashtable<Integer, String> h=new Hashtable<Integer, String>();
		h.put(1, "Collection");
		h.put(2, "of");
		h.put(3, "Java");
		
		//create a clone copy of Hashtable
		Hashtable<Integer, String> h1=new Hashtable<Integer, String>();
		h1=(Hashtable)h.clone();
		
		System.out.println("Value from h Table =" + h );
		System.out.println("Value from h1 Table =" + h1 );
		
		h.clear();
		
		System.out.println("Value from h Table =" + h );
		System.out.println("Value from h1 Table =" + h1 );
		
		//Contains Value
		Hashtable<Integer, String> h3=new Hashtable<Integer, String>();
		h3.put(1, "Arnav");
		h3.put(2, "Playing");
		h3.put(3, "Tabla");
		h3.put(4, "Very Well");
		
		if(h3.containsValue("Tabla"))
		{
			System.out.println("Value is present");
		}else
		{
			System.out.println("Value not present");
		}
	}

}
