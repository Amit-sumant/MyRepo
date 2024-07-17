package javaBasic;

public class String_Alternate_Print {

	public static void main(String[] args) 
	{
		String s = "This is Java Selenium Tutorials";
		System.out.println(s.length());
		
		for(int i=0; i<s.length(); i=i+2)
		{
			
				System.out.print(s.charAt(i));
			
				
			//System.out.print(s.charAt(i));
		}
		

	}

}
