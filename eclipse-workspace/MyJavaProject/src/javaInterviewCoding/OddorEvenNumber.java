package javaInterviewCoding;

import java.util.Scanner;

public class OddorEvenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Number");
		
		int num = sc.nextInt();
		
		if (num % 2 ==0)
		{
			System.out.println("This is Even Number -> " + num);
		}
		else
			System.out.println("This is Odd number -> " + num);

	}

}
