package javaBasic;

public class Try_Catch 
{

	public static void main(String[] args) 
	{
		System.out.println("This is before Try Catch");
		
		int i=10;
		//int res=0;
		
		try
		{
			System.out.println("Your Result -> " + i/0);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("this catch block handled");
		}
		finally
		{
			System.out.println("This is Finally block");
		}
		//System.out.println("Your Result -> " + res);
		
		System.out.println("Out of Prog now");

	}

}
