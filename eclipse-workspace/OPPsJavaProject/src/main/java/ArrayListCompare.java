import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) 
	{
		//Comparing two arrays
		
		ArrayList<String> list=new ArrayList<String>(Arrays.asList("A","B","8","C","10"));
		
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("A","B","9","C","D"));
		
		Collections.sort(list);
		Collections.sort(list1);
		
		System.out.println(list.equals(list1));
	}

}
