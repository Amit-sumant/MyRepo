package hashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmaptoArrayList {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String, String>();
		
		map.put("India", "New Delhi");
		map.put("USA", "Washington");
		map.put("Germany", "Berlin");
		map.put("Holland", "Amsterdam");
		map.put("Switzerland", "Zurich");
		
		//Print the value
		Iterator it= map.entrySet().iterator();
		
		while(it.hasNext())
		{
			
		}

	}

}
