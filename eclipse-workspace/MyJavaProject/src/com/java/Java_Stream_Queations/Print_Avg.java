package com.java.Java_Stream_Queations;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Print_Avg {

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10,10,20,40);
		
		System.out.println("Your Current List " + list);
		
		double d = list.stream().mapToInt(e -> e).average().getAsDouble();
		
		System.out.println(d);

	}

}
