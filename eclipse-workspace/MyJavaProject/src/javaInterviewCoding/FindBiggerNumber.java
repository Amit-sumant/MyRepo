package javaInterviewCoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class FindBiggerNumber {
	
	//this is prog to find dupliocate char from sting

	public static void main(String[] args) 
	{
		String str = "This is an Array";
		int cnt=0;
		
		char[] numstr = str.toCharArray();
		
		for(int i=0;i<numstr.length;i++)
		{
			for(int j=i+1;j<numstr.length;j++)
			{
				if(numstr[i]==numstr[j])
				{
					System.out.print(numstr[j] + " ");
					cnt++;
					break;
				}
			}
		}
	}

}
