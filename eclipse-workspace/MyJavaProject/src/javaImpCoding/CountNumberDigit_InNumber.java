package javaImpCoding;

import java.util.Scanner;

public class CountNumberDigit_InNumber {

	public static void main(String[] args) 
	{
		// if entered 1246789 then output should be 7
		
		
		  int num=12; int cnt=0;
		  
		  while(num>0) 
		  { 
			  num=num/10; 
		  	  cnt++; 
		  }
		  
		  System.out.println("Your Number count is -> " + cnt);
		  
		  System.out.println(" ");
		  System.out.println("************Using Scanner**************");
		  
		  int a[]= {1,2,5,8,9,6};
		  
		  		  
		  for(int i=0;i<=a.length;i++)
		  {
			  if(a[i]%2==0)
			  {
				  System.out.println("This is even Array " + a[i]);
			  }
			  
		  }
		
		  
		System.out.println(" ");
		System.out.println("************Using Scanner**************");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number digit");
		
		int digit = sc.nextInt();
		
		int count=0;
		
		while(digit>0)
		{
			digit=digit/10;
			count++;
		}
		
		System.out.println("Your digit count is -> " + count);
		
		if(count%2==0)
		{
			System.out.println("Your Entered Digit is Even number");
		}
		else
		{
			System.out.println("Your Entered Digit is Odd number");
		}

	}

}
