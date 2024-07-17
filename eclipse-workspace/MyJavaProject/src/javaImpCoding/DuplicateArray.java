package javaImpCoding;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) 
	{
		// find duplicate array. Here coparing with word that's why need 2 for loop
		
		String str[]= {"Java","C","C#","Python","SQL","Java","C",".net","SQL"};
		
		for(int i=0;i<=str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					System.out.println("Your duplicate word as- > " + str[i]);
				}
			}
		}
		
		System.out.println("");
		System.out.println("--------------Find duplicate value from sentence-------------------");
		
		
		String str1[]= {"i","t","1","i"};
		
		//HashSet<String> input=new HashSet<String>();
		
		for(int a=0;a<str1.length;a++)
		{
			for(int b=a+1;b<str1.length;b++)
			{
				if(str1[a]==str1[b])
				{
					System.out.println(" -> " + str1[a]);
				}
			}
			
			/*
			 * if(input.add(str1[a])==false) 
			 * { 
			 * System.out.println("Duplicate words are -> " + str1[a]); 
			 * }
			 */
		}	

	}

}