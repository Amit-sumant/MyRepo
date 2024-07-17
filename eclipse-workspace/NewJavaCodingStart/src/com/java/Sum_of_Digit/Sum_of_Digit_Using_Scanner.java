package com.java.Sum_of_Digit;

import java.util.Scanner;

public class Sum_of_Digit_Using_Scanner {

	public static void main(String[] args) 
	{
		int sum = 0; int cnt=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Number");
		
		int num = sc.nextInt();
		
		
		while(num>0)
		{
			sum = sum + num%10;
			num = num/10;
			cnt++;
		}
		
		System.out.println("Your Sum of Digit Nyumber -> " + sum);
	}

}
