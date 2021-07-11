package javaBasic;
import java.util.*;

public class IfElseConditions {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your value of I");
		int i=in.nextInt();
		
		//new
		//int i=50;
		//int j=60;
		
		System.out.println("Enter your value of J");
		int j=in.nextInt();
		
		if(i==j)
		{
			System.out.println("I and J are equal");
		}
		else
		{
			System.out.println("I and J are not equal");
		}
		
		in.close();
		
		//write code to find highest value
		int a1=400; int b2=500; int c3=300;
		
		if(a1>b2 & a1>c3)
		{
			System.out.println("A1 is greater value");
		}
		else
		{
			if(b2>c3)
			{
				System.out.println("B2 is greater value");
			}
			else
			{
				System.out.println("C3 is highest value");
			}
		}

	}

}
