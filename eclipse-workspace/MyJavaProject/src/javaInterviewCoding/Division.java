package javaInterviewCoding;

import java.util.Scanner;

public class Division {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int divided;
		int divisor;
		
		divided = sc.nextInt();
		divisor = sc.nextInt();
		
		System.out.println("Your answer for this -> " + (divided/divisor));
		
		System.out.println("---------------------Using hard coded value-----------------");
		
		int d = 100;
		int d1=1000;
		
		int division = divided / divisor;
		int reminder = divided % divisor;
		
		System.out.println("Result is ->" + division + " " + reminder);
		
		

	}

}
