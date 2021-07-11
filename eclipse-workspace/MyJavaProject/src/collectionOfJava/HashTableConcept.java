package collectionOfJava;

import java.util.Hashtable;

public class HashTableConcept 
{

	public static void main(String[] args) 
	{
		//HashTable is similar to HashMap and it is Synchronized.
		//Store the value in from of Key Val
		//Key==> Object ==> HashCode ==> Value
		
		Hashtable ht=new Hashtable();
		ht.put(1, "Amit");
		ht.put(2, "Learning");
		ht.put(3, "Java Selenium");
		
		//Create a Clone copy 
		Hashtable ht1=new Hashtable();
		
		ht1=(Hashtable)ht.clone();
		
		System.out.println("The value from HT" + ht);
		System.out.println("The value from HT1" + ht1);
		
		//Contains value map
		Hashtable ht2=new Hashtable();
		ht2.put(1, "I");
		ht2.put(2, "Love");
		ht2.put(3, "Goa");
		
		if(ht2.containsValue("I"));
		System.out.println("The Found");
		

	}

}
