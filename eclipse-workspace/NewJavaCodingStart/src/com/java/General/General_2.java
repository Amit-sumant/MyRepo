package com.java.General;

public class General_2 
{

	public static void main(String[] args) 
	{
		// count sum of digit
		
		int num = 123456;
		//int sum=0;
		
		int even_cnt=0;
		int odd_cnt=0;
		
		if(num>0)
		{
			int rem = num%10; // 4 
			
			if(rem%2==0)
			{
				even_cnt++; // 1
			}
			else
			{
				odd_cnt++;
			}
			
			num = num/10;
		}
		
		System.out.println("Even Num -> " + even_cnt);
		System.out.println("Odd Num -> " + odd_cnt);
		
		/*while(num>0)
		{
			sum = sum + num%10;
			num = num/10;
		}*/
		
		//System.out.println(sum);

	}

}
