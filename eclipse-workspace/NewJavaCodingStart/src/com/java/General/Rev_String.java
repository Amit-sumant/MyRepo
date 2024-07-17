package com.java.General;

import java.util.Scanner;

public class Rev_String {
	public void revString() {
		
		  String rev=""; 
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter your String");
		  
		  String str = sc.nextLine(); 
		  String tmp_str=str; 
		  int len = str.length();
		  
		  
		  for(int i=len-1;i>=0;i--) 
		  { 
			  rev = rev + str.charAt(i); 
		  }
		  
		System.out.println(rev);

		if (tmp_str.equals(rev)) {
			System.out.println("String -" + rev + " is a Palindrome");
		} else {
			System.out.println("String -" + rev + " is not a Palindrome");
		}
	}

	public static void main(String[] args) 
	{
		
		Rev_String rs = new Rev_String();
		rs.revString();

	}

}
