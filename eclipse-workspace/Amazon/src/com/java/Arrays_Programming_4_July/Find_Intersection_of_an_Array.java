package com.java.Arrays_Programming_4_July;

import java.util.ArrayList;

public class Find_Intersection_of_an_Array {

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4};
		int arr1[] = {4,5,6,1};
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			ar.add(arr[i]);
		}
		for(int i=0;i<arr1.length;i++)
		{
			if(ar.contains(arr1[i]))
			{
				System.out.println("Your Intersection Array is - " + arr1[i]);
			}
		}
		
		stringInsertion();

	}
	
	public static void stringInsertion()
	{
		String str1[] = {"Arnav","Tanush","Anvi","Srinika"};
		String str2[] = {"Sharvil","Aryana","Tanaya","Tanush","Arnav"};
		
		ArrayList<String> strList=new ArrayList<>();
		
		for(int i=0;i<str1.length;i++)
		{
			strList.add(str1[i]);
		}
		for(int i=0;i<str2.length;i++)
		{
			if(strList.contains(str2[i]))
			{
				System.out.println("Your String - " + str2[i].toString());
			}
		}
	}

}
