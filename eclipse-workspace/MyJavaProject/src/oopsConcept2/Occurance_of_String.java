package oopsConcept2;

import java.util.HashMap;
import java.util.Map;

public class Occurance_of_String {

	public static void main(String[] args) 
	{
		String str = "This this  is is is done by Kaushal  Kaushal";
		
		char ch[] = str.toCharArray();
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(map.get(ch[i]));
		}


	}

}
