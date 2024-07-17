package com.java.Java_Stream_Queations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Print_Sum_of_All_Numbers {

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> num = list.stream().reduce((a,b) -> a+b);
		System.out.println("Sum of Numbers -> " + num.get());
		
		System.out.println("----------------Print all average Numbers-----------------");
		
		List<Integer> listAvg = Arrays.asList(10,2);
		double avg = listAvg.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("Sum of Avg -> " + avg);
		
		
		System.out.println("----------------Square, Filter and Avg of Numbers-----------------");
		
		List<Integer> list3 = Arrays.asList(1,10,20,30,15);
		double squ = list3.stream().map(e -> e*e).filter(e -> e>100).mapToInt(e -> e).average().getAsDouble();
		System.out.println("Sum of Square Filter and Avg " + squ);
		
		System.out.println("----------------Print Number start with prefix with 2-----------------");
		
		List<Integer> list4 = Arrays.asList(1,10,20,30,15,22,44,245,67);
		List<Integer> prefix = list4.stream().map(e -> String.valueOf(e))
		.filter(e -> e.startsWith("2"))
		.map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(prefix);
		
		System.out.println("----------------Find Duplicate Numbers-----------------");
		
		List<Integer> list5 = Arrays.asList(1,10,20,30,15,10,20,22,44,245,30,67);
		
		Set<Integer> dlist = list5.stream().filter(e -> Collections.frequency(list5, e)>1).collect(Collectors.toSet());
		System.out.println(dlist);
	}

}
