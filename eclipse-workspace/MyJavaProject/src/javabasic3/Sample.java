package javabasic3;

import java.util.Arrays;

public class Sample 
{

	public static void main(String[] args) 
	{
		// count odd and even number
		
		int num[] = {10,15,58,28,99,66,70};
		
		int max = num[0];
		int min = num[1];
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max = num[i];
			}
		}
		
		System.out.println("Max value is - " + max);
	}

}
