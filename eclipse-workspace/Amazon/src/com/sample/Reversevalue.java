package com.sample;

import java.util.Scanner;

public class Reversevalue 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		int num=sc.nextInt();
		
		//using string buffer
		//StringBuffer str=new StringBuffer(String.valueOf(num));
		//StringBuffer rev= str.reverse();
		
		//int orgnum = num;
		int rev=0;
		
			
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num = num/10;
		}
		
		/*if(orgnum==rev)
		{
			System.out.println(orgnum + " Number is Palindrome");
		}
		else
		{
			System.out.println(orgnum + " Number is not Palindrome");
		}*/

		
		System.out.println("After reverse ->" + rev);
	}

}
