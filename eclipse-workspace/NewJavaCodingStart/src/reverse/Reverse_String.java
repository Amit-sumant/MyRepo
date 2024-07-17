package reverse;

import java.util.Scanner;

public class Reverse_String 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		String rev="";
		String str = sc.next();
		char ch[] = str.toCharArray();
		
		int len = ch.length;
		
		for(int i=len-1;i>=0;i--)
		{
			rev = rev + ch[i];
		}
		
		
		System.out.println("Your Reverse String -> " + rev); 

	}

}
