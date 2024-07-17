package javaImpCoding;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) 
	{
		// facorial num means 7 = 7*6*5*4*3*2*1
		int num = 7; int num1 = 9;
		long fact=1; long fact1=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Ur Num is -> " + fact);
		
		System.out.println("************Reverse*******************");
		
		for(int ii=num1;ii>=1;ii--)
		{
			fact1=fact1*ii;
		}
		
		System.out.println("Ur Rev fact Num is -> " + fact1);
		
		System.out.println("************Using Scanner*******************");
		
		
		long fact3=1; 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Factorial Number");
		
		int num2 = sc.nextInt();
		
		for(int j=1;j<=num2;j++)
		{
			fact3=fact3*j;
		}
		
		System.out.println(fact3);
	}

}
