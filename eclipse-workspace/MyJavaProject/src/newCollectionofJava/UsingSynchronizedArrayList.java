package newCollectionofJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UsingSynchronizedArrayList {

	public static void main(String[] args) 
	{
		// is a method - Collections.synchronizedList and pass new arraylist
		List<String> name = Collections.synchronizedList(new ArrayList<String>());
		
		name.add("Arnav");
		name.add("Tanush");
		name.add("Srnikika");
		name.add("Divyesh");
		name.add("Anvi");
		
		synchronized (name) 
		{
			Iterator<String> it= name.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		}
		
		System.out.println("***********Using copyOnWriteArrayList***********");
		
		CopyOnWriteArrayList<Integer> copyArray = new CopyOnWriteArrayList<>();
		
		copyArray.add(1);
		copyArray.add(2);
		copyArray.add(3);
		copyArray.add(4);
		copyArray.add(5);
		
		//here we don't need to use explicit synchronization
		
		Iterator<Integer> it1 = copyArray.iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
