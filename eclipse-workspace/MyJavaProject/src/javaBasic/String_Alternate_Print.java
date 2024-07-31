package javaBasic;

public class String_Alternate_Print {

	public static void main(String[] args) 
	{
		String s = "This is Java Selenium Tutorials";
				
		int len = s.length();
		String str[] = s.split(" ");
		
		/*for(int i=len-1; i>=0; i=i-2)
		{
			
			System.out.print(s.charAt(i));
				
		}*/
		
		//System.out.println(str[0]);
		
		for(int i=0;i<len;i++)
		{
			System.out.print(s.charAt(i) + " ");
		}
		

	}

	private static char[] s(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
