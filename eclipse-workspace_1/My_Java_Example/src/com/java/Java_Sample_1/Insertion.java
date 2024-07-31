package com.java.Java_Sample_1;

import java.util.ArrayList;

public class Insertion {

	public static void main(String[] args) 
	{
		int arr1[] = {10,11,12,13};
		int arr2[] = {12,14,15,16};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr1.length;i++)
		{
			list.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			if(list.contains(arr2[i]))
			{
				System.out.println("Youe Insertion Oredr -> " + arr2[i]);
			}
		}
		
	}

}
