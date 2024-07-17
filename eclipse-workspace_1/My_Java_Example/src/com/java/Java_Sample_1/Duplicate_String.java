package com.java.Java_Sample_1;


public class Duplicate_String 
{

	public static void main(String[] args) 
	{
		/*String str = "11 12 13 12 14 15 11";
		
		String str1[] = str.split(" ");
		
		for(int i=0;i<str1.length;i++)
		{
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[i].equals(str1[j]))
				{
					System.out.println(str1[i].toString());
				}
			}
		}*/
		
		usingString();
	}
	
	public static void usingString()
	{
		String str="Vishwanathan";
		
		char ch[] = str.toCharArray();
		int len = ch.length;
		
		for(int i=1;i<len;i++)
		{
			System.out.println(str.charAt(ch[i]));
		}
	}

}
