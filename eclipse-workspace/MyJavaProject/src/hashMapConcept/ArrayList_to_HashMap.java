package hashMapConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class ArrayList_to_HashMap 
{

	public static void main(String[] args) 
	{
		ArrayList<String> array = new ArrayList<String>(Arrays.asList("a","b","c","d"));
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int cnt=1;
		
		Iterator<String> it = array.iterator();
		
		while(it.hasNext())
		{
			map.put(it.next(), cnt++);
			
		}
		
		System.out.println(map.toString());

	}

}
