package reverse;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) 
	{
		//Reverse a NUmber
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number to Reverse");
		
		int num = sc.nextInt();
		
		//int rev=0;
		
		//while(num!=0)
	//	{
		//	rev=rev*10 + num%10;
		//	num = num/10;
	//	}
		
		//System.out.println("Your reverse number is -> " + rev);
		
		//***************without using string buffer**********************
		
		StringBuffer sb=new StringBuffer(String.valueOf(num)); //string.valueof convert this number into string format and that string value stored into sb
		
		StringBuffer rev= sb.reverse();
		
		

		System.out.println("Your reverse number is -> " + rev);
	}

}
