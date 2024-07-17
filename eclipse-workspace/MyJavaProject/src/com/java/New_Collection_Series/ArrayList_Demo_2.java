package com.java.New_Collection_Series;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo_2 {

	public static void main(String[] args) 
	{
		// using for each and Lambda function
		
		ArrayList<Integer> arlist=new ArrayList<Integer>();
		
		arlist.add(100);
		arlist.add(200);
		arlist.add(300);
		arlist.add(400);
		arlist.add(500);
		arlist.add(600);
		
		System.out.println(arlist.size());
		
		//using for each function
		arlist.add(2, 1000);
		
		for(int ar : arlist)
		{
			System.out.println(ar);
		}
		
		System.out.println(arlist.size());
		
		//Using Lambda Function
		
		//System.out.println("----------------Using Lambda Function-----------------");
		
		//arlist.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("Print in reverse order");
		
		Collections.sort(arlist, Collections.reverseOrder());
		
		for(Integer list :arlist)
		{
			System.out.println("Your Reverse Order - " + list);
		}
		
		
	}

}
