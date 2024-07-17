package javaImpCoding;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		// if number has 2 value and not divided by any then its a prime num like 1 5 7 13 19 23
		//and any number divided by multiple value then not a prime nnum
		
		int num=7;
		int cnt = 0;
		
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num % i==0)
					cnt++;
				
				if(cnt==2)
				{
					System.out.println("Prime Number");
				}
				else
				{
					System.out.println("Not Prime Number");
				}
			}
			
		}
		
	}

}
