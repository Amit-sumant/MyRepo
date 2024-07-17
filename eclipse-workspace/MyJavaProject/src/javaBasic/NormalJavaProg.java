package javaBasic;

import java.util.Scanner;

public class NormalJavaProg {

	public static void main(String[] args) {
		 

		System.out.println("++++++++++++++++++++++++//vowel or constant//+++++++++++++++++++++++++++++++++++++++");

		
		  char ch='a';
		  
		  if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o'
		  || ch=='O' || ch=='u' || ch=='U') {
		  System.out.println("This is Vowel Numner -> " + ch); } else {
		  System.out.println("This is Normal" + ch); }
		 

		System.out.println("++++++++++++++++++++++++//Factorial//+++++++++++++++++++++++++++++++++++++++");

		int num = 6;
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println("Yor Factorial for this number for -> " + num + " is = " + fact);

	}

}
