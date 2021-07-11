package hashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;

public class CompareHashMap {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashMap<Integer, String> str1=new HashMap<Integer, String>();
		str1.put(1, "Mercedes");
		str1.put(2, "BMW");
		str1.put(3, "Audi");
		str1.put(4, "Range Rover");
		str1.put(5, "Jaguar");
		str1.put(6, "Ford");
		str1.put(7, "Skoda");
		
		HashMap<Integer, String> str2=new HashMap<Integer, String>();
		str2.put(1, "Mercedes");
		str2.put(2, "BMW");
		str2.put(3, "Audi");
		str2.put(4, "Range Rover");
		str2.put(5, "Jaguar");
		str2.put(6, "Ford");
		str2.put(7, "Skoda");
		
		HashMap<Integer, String> str3=new HashMap<Integer, String>();
		str3.put(1, "Mercedes");
		str3.put(2, "BMW");
		str3.put(3, "Audi");
		str3.put(6, "Ford");
		str3.put(4, "Range Rover");

		
		//for comparing using equals method
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		//compare hash for both Keys
		System.out.println(str1.keySet().equals(str3.keySet()));
		
		//compare hash for Values
		//duplicate are not allowed
		System.out.println(new ArrayList<>(str1.values()).equals(new ArrayList<>(str3.values())));

	}

}
