package com.test.SampleJava;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jsoup.select.Collector;

public class Sample 
{
	
	public static void main(String[] args) 
	{
		//integer array to integer
		
		String arr[]= {"a","m","i","t"}; //output shoudl be amit
		
		//using join methid
		String join = String.join("", arr);
		
		System.out.println("After Join ->" + join);
		
		//-------------
		
		String str1 = Arrays.asList("S","e","l","e","n","i","u","m").stream().collect(Collectors.joining(""));
		System.out.println(str1);
		
		Stream<Object> val1=Arrays.asList(1,2,3,4,5,6,7,8,9).stream().map(e -> String.valueOf(e));
		
		//String array to int array
		
		String str[]= {"1","2","3","4"};
		
		int [] ar=new int[str.length];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]= Integer.parseInt(str[i]);
		}
		
		System.out.println(Arrays.toString(ar));
		
		
		String x="abc";
		String y="xyz";
		
		x.concat(y);
		System.out.println(x);
	}

}
