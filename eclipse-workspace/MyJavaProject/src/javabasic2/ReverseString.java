package javabasic2;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		String str="Amit Sumant";
		String rev="";
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev + str.charAt(i);
		}

		System.out.println(rev);
		
		System.out.println("---------------------------Using tocharArray----------------------------------");
		System.out.println("--------------------------------------------------------------");
		
		
		String str1="abcdef";
		String rev1="";
		
		char a[] = str1.toCharArray();
		
		int len1 = a.length;
		
		for(int i=len1-1; i>=0; i--)
		{
			rev1=rev1+a[i];
		}
		
		System.out.println(rev1);
		
		
		System.out.println("---------------------------Using String Buffer----------------------------------");
		System.out.println("--------------------------------------------------------------");
		
		String str2 = "Arnav";
		StringBuffer sb=new StringBuffer(str2);
		
		System.out.println(sb.reverse());
		
		System.out.println("---------------------------Using Collection----------------------------------");
		System.out.println("--------------------------------------------------------------");
		
		String [] mystr= {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
		System.out.println("Original Array - " + Arrays.asList(mystr));
		
		Collections.reverse(Arrays.asList(mystr));
		System.out.println("Reverse Array - " + Arrays.asList(mystr));
		
	}

}
