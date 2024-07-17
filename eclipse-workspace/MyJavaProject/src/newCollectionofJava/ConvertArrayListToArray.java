package newCollectionofJava;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray 
{
	
	//ConvertArrayListToArra

	public static void main(String[] args) 
	{
		ArrayList<String> arraylist=new ArrayList<>();
		
		arraylist.add("A");
		arraylist.add("B");
		arraylist.add("C");
		arraylist.add("D");
		
		//ArrayList to String array conversion
		String[] str=new String[arraylist.size()];
		
		for(int i=0;i<arraylist.size();i++) 
		{
				str[i]=arraylist.get(i);
		}
		
		// Print elements using for-each loop
		for(String stt : str)
		{
			System.out.println(stt);
		}

	}

}
