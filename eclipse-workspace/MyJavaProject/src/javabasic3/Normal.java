package javabasic3;

public class Normal 
{

	public static void main(String[] args) 
	{
		String str = "ABCBA";
		String rev="";
		
		int len = str.length();
		
		String duplicate_str = str;
		
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+str.charAt(i); 
		}
		//System.out.println(rev);
		
		if(duplicate_str.equals(rev))
		{
			System.out.println(duplicate_str + " Your String is Palindrome");
		}
		else
		{
			System.out.println(duplicate_str + " Your String is not Palindrome");
		}
		
		//Using tochararray method
		
		System.out.println("--------------Using TocharArray--------------");
		System.out.println(" ");
		
		String str1 = "UVWXYZ";
		String rev1 = "";
		
		int len1 = str1.length();
		
		char[] ch = str1.toCharArray();
		
		for(int j=str1.length()-1;j>=0;j--)
		{
			rev1=rev1+ch[j];
		}
		
		System.out.println(rev1);

	}

}
