package javaBasic;

import java.util.Scanner;

public class Count_Number_of_String 
{

	public static void main(String[] args) 
	{
		int cnt=1;
		Scanner sc=new Scanner(System.in);
		//The System.in parameter is used to take input from the standard input. It works just like taking inputs from the keyboard. 
		//We have then used the nextLine() method of the Scanner class to read a line of text from the user.
		//To get the instance of Java Scanner which reads input from the user, 
		//we need to pass the input stream (System.in) in the constructor of Scanner class. 
		
		System.out.println("<- Enter Your String ->");
		
		String str=sc.nextLine();
		
		for(int i=0; i<str.length(); i++)
		{
			if ((str.charAt(i) == ' '))
			{
				cnt=cnt+1;
			}
			//System.out.println(cnt);
		}
		System.out.println(cnt);
		
		//Number of characters
		
		System.out.println("Number of characters in a String");
		
		String stt="Hi this is Amit";
		
		int cntt = 0;
		
		for(int j=0; j<stt.length(); j++)
		{
			if(stt.charAt(j) != ' ')
			{
				cntt++;
			}
			
		}
		System.out.println(cntt);
		
	}
	
}