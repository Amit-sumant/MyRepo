package reverse;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) 
	{
		String rev="";
		Scanner sc=new Scanner(System.in); //Scanner is a class and system.in is argument
		
		System.out.println("Enter your String");
		
		String str = sc.next();
		
		int len = str.length();
		System.out.println("The Lenght of a String is -> " + len);
		//char a = str.charAt(0);
		
		String tmp_str=str;
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Your Reverse String is -> " + rev);
		
		
		if(tmp_str.equals(rev))
		{
			System.out.println("Your String is Palindrome");
		}
		else
		{
			System.out.println("Your String is not Palindrome");
		}

	}

}
