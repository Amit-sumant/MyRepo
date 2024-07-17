package javabasic2;

public class Find_String_Reverse 
{

	public static void main(String[] args) 
	{
		//first 3 characters should not be reverse
		
		String str1 = "Hi I am Java Selenium";
		
		System.out.println(str1.length());
		
		String[] s1 = str1.split(" ");
		
		for(int i=s1.length-1;i>=s1.length-2;i--)
		{
			char[] ch = s1[i].toCharArray();
			
			for(int j=1;j<=ch.length;j++)
			{
				System.out.print(ch[ch.length-j]);
			}
			System.out.print(" ");
		}
		
		

	}

}
