package com.java.New_Collection_Series;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Duplicate_ArrayList_Using_LinkHashSet {

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> nos=new ArrayList<Integer>(Arrays.asList(1,1,2,3,3,4,5,6,6,5,8,7,9,7,10));
		
		//ArrayList is belongs from List family so no duplicate value
		
		LinkedHashSet<Integer> ll=new LinkedHashSet<Integer>(nos);
		
		ArrayList<Integer> nums=new ArrayList<>(ll);
		
		System.out.println("Your Pur Value now -> " + ll);
		 
		//Using JDK - 8 // stream
		
		ArrayList<Integer> marklist=new ArrayList<Integer>(Arrays.asList(11,11,12,12,13,14,15,15,16,16,17,18,18,19,20));
		
		//using stream Method
		//Distinct - Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream. 
		
		//List<Integer> listm = marklist.stream().distinct().collect(Collectors.toList());
		List<Integer> listm = marklist.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Mark List is -> " + listm);
		
		ArrayList<String> ar=new ArrayList<String>(Arrays.asList("Amit","Tushar","Ashutosh","Kedar","Kaustubh","Amit"));
		
		List<String> st = ar.stream().distinct().collect(Collectors.toList());
		System.out.println(st);

	}

}
