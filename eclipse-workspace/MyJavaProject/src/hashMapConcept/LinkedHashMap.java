package hashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> lmap=new java.util.LinkedHashMap<String, Integer>();
		
		lmap.put("a", 1);
		lmap.put("b", 2);
		lmap.put("c", 3);
		lmap.put("d", 4);
		
		//loop
		for(Map.Entry<String, Integer> mapelement : lmap.entrySet())
		{
			String key = mapelement.getKey();
			
			Integer val = mapelement.getValue();
			
			System.out.println("Key -> " + key + " " + "Value -> " + val);
		}
		

	}

}
