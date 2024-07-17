package com.java.Mini_Java_Queations;

import java.util.Scanner;

public class Convert_Normal_String_to_FirstLetter_Capital {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		
		String str = sc.nextLine();
		//String str = "arnav ashwini amit sumant";
		
		//o/p should be Amit Ashwini Amit Sumant
		
		String[] word = str.split("\\s");
		String result="";
		
		for(String w : word)
		{
			String firstLetter = w.substring(0, 1).toUpperCase();//first letter become capital
			String remainingLetter = w.substring(1);
			result = result + firstLetter + remainingLetter + " ";
		}
		
		amit: //java 
		System.out.println(result.trim());

	}

}
