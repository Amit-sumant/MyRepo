package com.java.General;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SplitString 
{

	public static void main(String[] args) 
	{
		String name = "Amit Sumant Java";
		
		/*String str[] = name.split(" ");
		
		for(String stt : str)
		{
			System.out.println(stt);
		}*/
		
		char[] ch = name.toCharArray();
		String str = "";
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]!=' ')
			{
				str = str + ch[i];
			}
		}
		System.out.println(str);
	}

}
