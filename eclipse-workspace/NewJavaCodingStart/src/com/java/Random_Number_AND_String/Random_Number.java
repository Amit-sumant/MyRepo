package com.java.Random_Number_AND_String;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) 
	{
		//in build class is Random
		
		Random rnd=new Random();
		int randomvalue = rnd.nextInt(50);
		
		System.out.println("Random Num -> " + randomvalue);
		
		
		double random = rnd.nextDouble();
		System.out.println("Random Num -> " + random);
		
		
		
	}

}
