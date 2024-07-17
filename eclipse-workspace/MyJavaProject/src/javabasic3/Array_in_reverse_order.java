package javabasic3;

public class Array_in_reverse_order 
{

	public static void main(String[] args) 
	{
		//Array in Reverse order
		
		Integer[] intArray = {10,20,30,40,50,60,70,80,90};
		
		System.out.println(intArray.length);
		
		for(int i=0;i<intArray.length;i++)
		{
			System.out.print(" " + intArray[i]);
		}
		
		System.out.println(" ");
		
		for(int i=intArray.length-1;i>=0;i--)
		{
			System.out.print(" " + intArray[i]);
		}
		

	}

}
