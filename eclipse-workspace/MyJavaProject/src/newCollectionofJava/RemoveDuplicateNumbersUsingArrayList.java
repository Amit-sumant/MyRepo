package newCollectionofJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateNumbersUsingArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10));
		
		LinkedHashSet<Integer> linknum = new LinkedHashSet<>(arr);
		
		ArrayList<Integer> noduplicate = new ArrayList<>(linknum);
		
		System.out.println(noduplicate);
		
		//Using Stream JDK 8
		System.out.println("****************Using Stram*****************");
		ArrayList<Integer> arrjdk = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10));
		List<Integer> unilist = arrjdk.stream().distinct().collect(Collectors.toList());
		
		System.out.println(unilist);
		
		
		System.out.println("****************Stram using Iterator*****************");
		
		ArrayList<Integer> arriterator = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10));
		
		Iterator<Integer> itt =  arriterator.stream().distinct().iterator();
		
		while(itt.hasNext())
		{
			System.out.println(itt.next());
		}
		
	}

}
