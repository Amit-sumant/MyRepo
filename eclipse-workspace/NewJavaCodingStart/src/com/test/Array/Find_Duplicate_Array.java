package com.test.Array;

public class Find_Duplicate_Array 
{

	public static void main(String[] args) 
	{
		String str[] = {"Amit","Arnav","Ashwini","Amit","Aditya","Tanush","Chetan","Chetan","Aditya"};
		
		System.out.println(str.length);
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1; j<str.length; j++)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println(str[i]);
				}
			}
		}

	}

}
