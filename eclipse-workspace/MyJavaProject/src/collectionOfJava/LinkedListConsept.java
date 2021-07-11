package collectionOfJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConsept {

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Test");
		ll.add("Selenium");
		ll.add("Java");
		ll.add("Clear");
		System.out.println(ll);
		
		ll.addFirst("Amit");
		ll.addLast("Now you will be getting job soon");
		
		System.out.println(ll);
		
		//get
		System.out.println(ll.get(0));
		//set
		ll.set(5, "Congratulations");
		System.out.println(ll.get(5));
		System.out.println("-----------------------------------------------");
		//To print all the value using For Loop
		
		for(int i=0; i<ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("------------------Iterator-----------------------------");
		//using iterator
		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
