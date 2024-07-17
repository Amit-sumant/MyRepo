package hashMapConcept;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class ArrayList_to_LinkedHashSet {

	public static void main(String[] args) 
	{
		ArrayList<String> arrayList = new ArrayList<>();
		 
        // adding values in the ArrayList
        arrayList.add("Geeks");
        arrayList.add("For");
        arrayList.add("Geeks");
        
        System.out.println(arrayList);
        
        LinkedHashSet<String> hash=new LinkedHashSet<String>(arrayList);
        
        System.out.println(hash);
        

	}

}
