package com.java.Basic_To_End;

public class Count_Num_Vowel_In_String 
{

	public static void main(String[] args) 
	{
		String str = "Hello This Is Java";
		int cnt=0;
		
		char[] ch = str.toCharArray();
		
		for(char c:ch)
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				System.out.print(" " + c);
				cnt++;
			}
		}
		System.out.println(" " + cnt);
		
		//----------------
		
		String string = "Hello Java";
		
		String[] st = string.split(" ");
		
		System.out.println(st[1]);

	}

}
