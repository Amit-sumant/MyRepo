package com.sample;

public class Splitmethod {

	public static void main(String[] args) 
	{
		String str = "1 page out 6 (50 pages)";
		
		str.indexOf("(");
		str.indexOf("pages");
		
		int pages = Integer.valueOf(str.substring(str.indexOf("(")+1, str.indexOf("pages")-1));
		
		System.out.println(pages);
		
		//string
		System.out.println("*************************");
		
		String myStr = "Hello";
		char result = myStr.charAt(1);
		System.out.println(result);
		
		//splitMethod();
		
	}

}
