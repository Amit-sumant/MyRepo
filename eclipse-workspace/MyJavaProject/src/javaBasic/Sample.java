package javaBasic;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) 
	{
		/*
		 * String str = "This is Java"; String st[] = str.split(" ");
		 * 
		 * for(int i=st.length-1;i>=0;i--) { System.out.print(st[i]);
		 * 
		 * if(i>0) { System.out.print(" "); }
		 * 
		 * }
		 */
		
		System.out.println("-----String array to String----");
		
		String [] arr= {"a","m","i","t"};
		
		String s = String.join("_", arr);
		System.out.println(s);
		
		System.out.println("-----Using Arrays.asList----");
		
		String str = Arrays.asList("a","m","i","t").stream().collect(Collectors.joining("_"));
		System.out.println("Your String is -> " + str);
		
		System.out.println("-----Using String Builder----");
		
		
		System.out.println(joinStrings("", "m","a","d","h"));
		

	}
	
	public static String joinStrings(String sep, String... val)
	{
		StringBuilder sb=new StringBuilder();
		int end=0;
		
		for(String s : val)
		{
			if(s!=null)
			{
				sb.append(s);
				end = sb.length();
				sb.append(".");
			}
		}
		return sb.substring(0, end);
		
	}

}