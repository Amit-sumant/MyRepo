package com.sample.collection_22_June_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateArray {

	public static void main(String[] args) 
	{
		ArrayList<String> ar=new ArrayList<String>(Arrays.asList("A","A","B","C","Z","M","Q","L","Q"));
		
		LinkedHashSet<String> link = new LinkedHashSet<>(ar); // set does not allow dupliacte element
		//below again array created bevause we need to store non duplicate num in array
		ArrayList<String> arlistwithoutduplicate=new ArrayList<String>(link);
		
		System.out.println("Your Duplicate Ele -> " + arlistwithoutduplicate);
		
		//using distinct method
		
		System.out.println("----------------------------------------------------------------------");
		
		ArrayList<String> array=new ArrayList<String>(Arrays.asList("M","A","D","H","U","R","A","M","I","T"));
		
		List<String> list = array.stream().distinct().collect(Collectors.toList());
		
		System.out.println(list);
		
	}

}
