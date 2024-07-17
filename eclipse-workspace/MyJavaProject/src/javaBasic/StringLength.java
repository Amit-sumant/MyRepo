package javaBasic;

public class StringLength
{
	public static void main(String args[])
	{
		String str = "This is Selenium Jaba";
		int i=0;
		
		for(char c: str.toCharArray())
		{
			i++;
		}
		System.out.println("Length of this String value is =" + i);
	}
}
