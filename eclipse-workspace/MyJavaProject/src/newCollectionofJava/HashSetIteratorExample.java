package newCollectionofJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetIteratorExample 
{

	public static void main(String[] args) 
	{
		HashSet<String> hst=new HashSet<>();
		
		hst.add("Apple");
		hst.add("Samsung");
		hst.add("OnePlus");
		hst.add("Oppo");
		
			
		System.out.println(hst.size());
		
		Iterator<String> it =hst.iterator();
		
		while(it.hasNext())
		{
			String str = (String) it.next();
			System.out.println(str);
		}

	}

}
