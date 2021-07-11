package javaBasic;

public class FactorialNumber 
{

	public static void main(String[] args)
	{
		// factorial using for loop
		
		int num=6;
		int fact=1;
		
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		System.out.println("----------------------with Recursive function----------------------");

	}
	

}
