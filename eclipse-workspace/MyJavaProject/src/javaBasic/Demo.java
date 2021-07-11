package javaBasic;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {		
		
		
		
		System.out.println(countPalindrom(121, 111));
		
	}
	
	
	public static int countPalindrom(int number1, int number2) {
		
		int result= checkPal(number1)+checkPal(number2);
		
		return result;
	}
	
	
	private static int checkPal(int num) {
		 int reversein = 0;
		 int remainder;
		 int orginalnum = num;
		 
		 while(num !=0) {
			 remainder = num%10;
			 reversein= (reversein*10)+remainder;
			  num  = num/10;
		 }
		 
		 if(orginalnum ==reversein) {
			 return 1;			 
		 } else {
			 return 0;
		 }
		 
		
	}

}
