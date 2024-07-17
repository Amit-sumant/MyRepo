package javabasic2;

import java.util.Scanner;

public class SumofDigit_in_number {

	public static void main(String[] args) 
	{
		int num = 999999999;
		int sum=0;
		
		while(num>0)
		{
			sum = sum + num%10;
			num = num / 10;
		}
		System.out.println("Your sum of digit -> " + sum);
		
		System.out.println("                              Using Scanner                           ");
		System.out.println("***********************************************************************");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number");
		
		int cntnum = sc.nextInt();
		int sum1=0;
		
		while(cntnum>0)
		{
			sum1 = sum1 + cntnum%10;
			cntnum = cntnum/10;
		}
		
		System.out.println("Your sum of digit -> " + sum1);
		
	}

}
