package collectionOfJava;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SynchrinizedArrayListExample 
{

	public static void main(String[] args) 
	{
		List<Object> lst= Collections.synchronizedList(new ArrayList<Object>());
		
		lst.add("Arnav");
		lst.add("Playing");
		lst.add("Tabla and Lawn Tennis");
		
		//to fetch the value from the list - we use explicit synchronization
		
		synchronized (lst)
		{
			Iterator<Object> itr=lst.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		
		//using CopyOnWriteArrayList -> Its a class
		
		CopyOnWriteArrayList<Object> cpy = new CopyOnWriteArrayList<Object>();
		cpy.add(10);
		cpy.add("This is Synchrinized Tread Concept");
		cpy.add("Using Copy On Write Array List");
		
		Iterator<Object> it = cpy.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}
}
