package com.sample.collection_22_June_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args)
	{
		ArrayList<Integer> ar=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		ar.removeIf(num -> num%2!=0);
		System.out.println(ar);
		
		System.out.println("=============================================================");
		
		ArrayList<Integer> ar1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		ar1.removeIf(num -> num%2==0);
		System.out.println(ar1);
		
		System.out.println("================ArryList Contains====================");
		
		arryListContains();
		
		System.out.println("================ArrayList Descending Sort====================");
		
		ArrayListDescendingSort();
		
	}
	
	public static void arryListContains()
	{
		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(3,7,13,17,19,23,29));
		
		if(arr.contains(39))
		{
			System.out.println("Your Array is Present in list");
		}
		else
		{
			System.out.println("Your Array is Not Present in list");
		}
	}
	
	public static void ArrayListDescendingSort()
	{
		ArrayList<String> arrList = new ArrayList();
        arrList.add("Apple");
        arrList.add("Banana");
        arrList.add("Pear");
        arrList.add("Alphanso Mango");
        
        System.out.println("Before Sorting - ");
        
        for(String str : arrList)
        {
        	System.out.println(str);
        }
        
        Collections.sort(arrList, Collections.reverseOrder());
        
        System.out.println("After Sorting - ");
        
        for(String str : arrList)
        {
        	System.out.println(str);
        }

	}

}
