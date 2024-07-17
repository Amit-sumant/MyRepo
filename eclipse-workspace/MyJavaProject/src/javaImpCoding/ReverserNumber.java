package javaImpCoding;

import java.util.Scanner;

public class ReverserNumber 
{
	static int i;
	//static int rev=0;
	//static int num;

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your number for Reverse");
		
		/*
		 * num = scn.nextInt(); //this method and store
		 * 
		 * while(num!=0) { rev = rev*10 + num%10; num = num/10;
		 * 
		 * }
		 * 
		 * System.out.println("Your Number become now -> " + rev);
		 */
		
		System.out.println("*******************Reverse String*************************");
		
		/*
		 * String str;
		 * 
		 * str = scn.next(); char[] chr = str.toCharArray(); char[] revchar = new
		 * char[chr.length];
		 * 
		 * System.out.println("Printed -> " + str);
		 * 
		 * int j=0;
		 * 
		 * for(int i=chr.length-1; i>=0; i--) { //System.out.println(chr[i]);
		 * revchar[j++]=chr[i]; } System.out.println("Printed -> " +
		 * String.valueOf(revchar));
		 */
		
		System.out.println("*******************Reverse String using String Buffer*************************");
		
		int num=scn.nextInt();
	
		StringBuffer sbf=new StringBuffer(String.valueOf(num));
		StringBuffer rev = sbf.reverse();
		
		System.out.println("Your String value now -> " + rev);
		
	}

}
