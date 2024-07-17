package javabasic2;

public class CountNumber 
{

	public static void main(String[] args) 
	{
		int num=789654123;  //using "/" it gives alwways last digit
		int count=0;
		
		while(num>0)
		{
			num = num/10;
			count++;
		}
		
		System.out.println("Your Length of this number is -> " + count);
		
		System.out.println("                       count length of string                                     ");
		
		
		String str="Arnav Amit Ashwini Sumant";
		
		int cnt=0;
		
		for(int i=0;i<str.length();i++)
		{
				if(Character.isDefined(str.charAt(i)))
				{
					cnt++;
				}
		}
		
		System.out.println("Your Length of this number is -> " + cnt);
	}

}
