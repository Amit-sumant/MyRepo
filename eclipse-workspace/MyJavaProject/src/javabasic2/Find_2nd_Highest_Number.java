package javabasic2;

import java.util.Arrays;
import java.util.Scanner;

public class Find_2nd_Highest_Number 
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,6,8,6,52,59,60,100,101};
		
		int size = arr.length;
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[size-2]);
		
		System.out.println("-----------------------------------------------------------");
		
		int arr1[] = {1,60,2,6,8,6,52,59,100};
		
		int size1 = arr1.length;
		int temp=0;
		
		//Arrays.sort(arr1);
		
		for(int i=0; i<size1-1;i++)
		{
			if(arr1[i]>arr1[i+1])
			{
				temp = arr1[i];
				arr1[i]=arr1[i+1];
				arr1[i+1]=temp;
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[size1-2]);
	}

}
