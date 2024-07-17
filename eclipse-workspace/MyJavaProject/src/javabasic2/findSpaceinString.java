package javabasic2;

import java.util.Scanner;

public class findSpaceinString 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		
		String str = sc.nextLine();
		
		System.out.println("Is string ("+str+") has space :" + hasSpace(str));

	}
	
	public static boolean hasSpace(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(0)==' ' || str.charAt(i)==' ' && str.charAt(i+1)!= ' ')
			{
				return true;
			}
		}
		return false;
	}

}
