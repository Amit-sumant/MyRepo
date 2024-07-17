package javaImpCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseNumberMultipleWays 
{

	public static void main(String[] args) 
	{
		System.out.println("*****Reverse number through an arry******");
		
		int[] arr=new int[] {1,2,3,4,5,6};
		
		System.out.println("Original Array");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Array in now reverse");
		
		for(int i=arr.length-1; i>=0;i--)
		{
			System.out.println("Reverse is as -> " + arr[i]);
		}
		
		System.out.println("*****Reverse number through an List collection******");
		
		List<String> str=new ArrayList<String>();
		
		str.add("Java");
		str.add("Selenium");
		str.add("SQL");
		str.add("Python");
		
		System.out.println("Before reverse order become -> " + str);
		
		Collections.reverse(str);
		
		System.out.println("Now reverse order become -> " + str);

	}

}
