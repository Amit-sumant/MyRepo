package com.sample;

import java.util.Scanner;

public class CountNumbersofDigit 
{

	public static void main(String[] args) 
	{
		int num1 = 987463177;
		int cnt1=0;
		
		while(num1>0)
			{
				num1=num1/10;
				
				cnt1++;
			}
		System.out.println("Number Digit -> " + cnt1);
		
		System.out.println("*************************Using Scanner**********************************");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number to identify Digits");
		int num = sc.nextInt();
		
		int cnt=0;
		int sum=0;
		
		while(num>0)
		{
			num=num/10;
			cnt++;
		}
		
		System.out.println("Number Digit -> " + cnt);
		
		if(num/2==0)
		{
			System.out.println("Number is Even");
			
		}
		else
		{
			System.out.println("Number is Odd");
		}
		
		

	}

}
