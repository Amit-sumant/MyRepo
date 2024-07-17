package com.sample;

public class Count_NumberOfEVEN_ODD_Digit 
{

	public static void main(String[] args) 
	{
		int evencnt=0;
		int oddcnt=0;
		
		int num=7896546;
		int sum=0;
		
		while(num>0)
		{
			int rem = num%10; //this gives you remainder value
			
			if(rem%2==0) //above code line 15 gives reminder so here it displayed 4. So 4 is %2 become 0
			{
				evencnt++; // cnt 4
			}
			else
			{
				oddcnt++;
			}
			
			num = num/10; //num 789654/10 = 78965
		}
		System.out.println("Number of even count -> " + evencnt);
		
		System.out.println("Number of odd count -> " + oddcnt);
		
		
		System.out.println("************************total of our digit number*************************************************");
		
		int num1=7896546;
		
		while(num1>0)
		{
			sum = sum + num1 % 10;
			num1= num1/10;
		}
		
		System.out.println("Total dinit of this number becomes -> " + sum);
	}

}
