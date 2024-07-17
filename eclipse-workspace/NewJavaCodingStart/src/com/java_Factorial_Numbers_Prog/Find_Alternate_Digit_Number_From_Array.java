package com.java_Factorial_Numbers_Prog;

public class Find_Alternate_Digit_Number_From_Array {

	public static void main(String[] args) 
	{
		// find alternate digit from number. e.g. if number is 10 12 13 15 14 09 45
		//thgen output print as 10 13 14 45
		
		int arr[] = {1,2,3,4,6,7,8,9};
		
		System.out.println(arr.length);
		
		System.out.println();
		
		for(int i=0; i<arr.length; i=i+2)
		{
			System.out.println(arr[i]);
		}
		

	}

}
