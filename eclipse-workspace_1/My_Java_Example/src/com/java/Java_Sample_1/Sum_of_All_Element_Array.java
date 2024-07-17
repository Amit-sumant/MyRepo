package com.java.Java_Sample_1;

public class Sum_of_All_Element_Array {

	public static void main(String[] args) 
	{
		int a[] = {11,21,51,75,65};
		int sum=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			sum = sum + a[i];
		}
		
		System.out.println(sum);
	}

}
