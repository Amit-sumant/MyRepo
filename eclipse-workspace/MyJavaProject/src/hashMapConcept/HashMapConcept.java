package hashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// No Order , No Indexing
		//Store value in K, V Key and Value format
		//Key can not be duplicate
		//can store n number of Null values, but one null key
		//Hashmap is not thread safe
		//IN Hashmap we are using Iterator over the Keys i.e. using Keyset()
		
		HashMap<Object, Object> hmp=new HashMap<Object, Object>();
		hmp.put(1, "Mercedes");
		hmp.put(2, "BMW");
		hmp.put(3, "Audi");
		hmp.put(4, "Range Rover");
		hmp.put(5, "Jaguar");
		hmp.put(6, "Ford");
		hmp.put(7, "Skoda");
		hmp.put(8, null);
		hmp.remove(8);
		
		System.out.println(hmp.get(6));
		System.out.println(hmp.get(null));
		System.out.println(hmp.get(5));
		
		Iterator<Object> it=hmp.keySet().iterator();
		while(it.hasNext())
		{
			int key =  (int) it.next();
			String value=(String) hmp.get(key);
			System.out.println("Key =>" + key + "Value =>" + value);
		}
		System.out.println("------------------------------------------------");
		//Hashmap using entry Key i.e. key and value (Very imp question)
		//Iterator over the set (pair) by using entrySet
		Iterator<Entry<Object, Object>> itr=hmp.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<Object, Object> entry=itr.next();
			System.out.println("Key =>" + entry.getKey()+ " " + "Value =>" + entry.getValue());
		}
		
		System.out.println("------------------Lambada function------------------------------");
		hmp.forEach((k,v) -> System.out.println("Key =" + k + " " + "Value =" + v));

	}

}
