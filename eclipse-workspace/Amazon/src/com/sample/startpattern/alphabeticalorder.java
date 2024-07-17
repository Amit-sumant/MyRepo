package com.sample.startpattern;

import java.util.Arrays;
import java.util.Scanner;

public class alphabeticalorder {

	public static void main(String[] args) 
	{
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String i = sc.nextLine();
		
		char chararray[] = i.toCharArray();
		
		Arrays.sort(chararray);
		
		System.out.println(new String(chararray));

	}

}
