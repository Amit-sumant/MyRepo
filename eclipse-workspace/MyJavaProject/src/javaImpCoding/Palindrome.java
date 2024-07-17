package javaImpCoding;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		int rev=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Palindrome Number");
		int num = sc.nextInt();
		
		int orgnum = num;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num = num/10;
		}
		
				
		if(orgnum==rev)
		{
			System.out.println("Your num is palindrome -> " + orgnum);
		}
		else
		{
			System.out.println("Your num is not palindrome -> " + orgnum);
		}

	}

}
