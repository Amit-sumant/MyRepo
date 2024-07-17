package javaBasic;

public class FinalFinallyFinalize {

	public static void main(String[] args) 
	{
		test();

	}
	
	public static void test()
	{
		int i=100;
		
		try
		{
			System.out.println("Inside try");
			i = i/0;
			
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Inside Catch Block");
		}
		finally
		{
			System.out.println("Though exception not occur, it will execute");
		}
	}

}
