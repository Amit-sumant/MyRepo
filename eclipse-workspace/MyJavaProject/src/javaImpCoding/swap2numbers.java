package javaImpCoding;

import java.util.Scanner;

public class swap2numbers {
	//static int i = 100;
	//static int j = 274;
	//static int cnt = 0;

	public static void main(String[] args) {
		int a;
		int b;
		int t;

		/*
		 * System.out.println("Number swap ->" + i + " " + " " + j);
		 * 
		 * cnt = i; i=j; j=cnt;
		 * 
		 * System.out.println("after swapping -" +i+ " " +j);
		 * 
		 * System.out.
		 * println("*****************Without third variable**********************");
		 * 
		 * i=i+j; j=i-j; i=i-j;
		 * 
		 * System.out.println("2nd Attempt after swapping -" +i+ " " +j);
		 */

		System.out.println("**********************Using Scanner*****************************");

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Before Swapping Value of A and B ->");
		a = scn.nextInt();
		b = scn.nextInt();
		
		System.out.println("Scanning Attempt before swapping -" + a + " " + b);

		/*
		 * a = a + b; b = a - b; a = a - b;
		 */
		t=a;
		a=b;
		b=t;

		System.out.println("Scanning Attempt after swapping -" + a + " " + b);

	}

}
