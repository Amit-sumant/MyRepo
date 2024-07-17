package com.java.IndexOf;

public class IndexOf_Example 
{

	public static void main(String[] args) 
	{
		String text = "That is main Java";
		
		text.indexOf("s");
		text.indexOf("Java");
		
		System.out.println("Actual Text is - " + text);
		
		String txt = text.substring(text.indexOf("s")+1,text.indexOf("Java")-1);
		
		System.out.println("After Indexing - " + txt);
		
		//---------------------------------------------

	}

}
