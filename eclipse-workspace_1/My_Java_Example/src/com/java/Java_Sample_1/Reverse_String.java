package com.java.Java_Sample_1;

import java.util.LinkedHashMap;

public class Reverse_String 
{

	public static void main(String[] args) 
	{
		String str = "Selenium";
		String rev = "";
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
		
		
		String strr[] = {"A","B","C","C","A","A","D","E"};
		int val;
	      
	      int len1 = strr.length;
	      
	      LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
	      
	      for(int i=0;i<len1;i++)
	      {
	    	  if(map.get(strr[i])!=(null))
	    	  {
	    		 val = map.get(strr[i]);
	    		 map.put(strr[i], val + 1);
	    	  }
	    	  else
	    	  {
	    		  map.put(strr[i], 1);
	    	  }
	      }
	      System.out.println(map.toString() + " ");
	}

}
