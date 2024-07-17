package com.java.coding_5_June_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sample.collection_22_June_2024.Arraylist;

public class Split_Integer_And_Factorial 
{

	public static void main(String[] args) 
	{
		int num = 456;
		int cnt = 0;
		ArrayList<Integer> list = new ArrayList();

		while (num > 0) 
		{
			cnt = num % 10;
			list.add(cnt);
			num = num / 10;

		}
		
		Collections.reverse(list);
		System.out.println(list.toString());
		
		  
		  for(Integer l1 : list) 
		  { 
			  System.out.println(l1 + " -> " + cntFact(l1)); 
		  }
		 
	}

	public static Integer cntFact(Integer fact) 
	{
		int result = 1;
		String disp="";

		for (int f = 1; f <= fact; f++) 
		{
			result = result * f;
			disp=disp+f;
			
			if(f<fact)
			{
				disp=disp+ "*";
			}
		}
		System.out.print(disp + " - ");
		return result;

	}

}
