package javaImpCoding;

import java.util.Arrays;
import java.util.Collections;

public class SortElementArray {

	public static void main(String[] args) 
	{
		// if array is in [10,20,30,50,60,40] then we need to sort properly
		
		/*int a[]= {10,60,20,40,30,50,40,0,70};
		
		System.out.println("Before Sort Array -> " + Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("After Sort Array -> " + Arrays.toString(a));*/
		
		Integer b[]= {1,99,88,15,37,98,66,44};
		
		Arrays.sort(b, Collections.reverseOrder());
		
		System.out.println("After Sort Array ikn decending -> " + Arrays.toString(b));

	}

}
