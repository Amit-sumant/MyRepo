package com.java.Mini_Java_Queations;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Integer_Array_To_Integer {

	public static void main(String[] args) 
	{
		String arr[] = {"a","m","i","t"};
		
		String join = String.join("_", arr);
		
		System.out.println(join);
		
		String join1 = Arrays.asList("P","A","N","J","I").stream().collect(Collectors.joining("-"));
		
		System.out.println(join1);
	}

}
