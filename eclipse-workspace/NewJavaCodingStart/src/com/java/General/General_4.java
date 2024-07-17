package com.java.General;

import java.util.Scanner;

public class General_4 
{
	public void reverse()
	{
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		
		int num = sc.nextInt();
		
		//while(num!=0)
		//{
			//rev=rev*10 + num%10;
			//num = num/10;
		//}
		
		int tmp_rev = num;
		
		for(int i=0; i<=num;i++)
		{
			rev=rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println(rev);
		
		if (tmp_rev==rev)
		{
			System.out.println("Number is Palindrome");
		
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
		
		
	}
	/*
	 * public void reverseappend() { int num1 = 4556; StringBuilder sb=new
	 * StringBuilder(); sb.append(num1); StringBuilder rev = sb.reverse();
	 * 
	 * System.out.println(rev); }
	 */

	public static void main(String[] args) 
	{
		General_4 g4=new General_4();
		g4.reverse();
		//g4.reverseappend();

	}

}
