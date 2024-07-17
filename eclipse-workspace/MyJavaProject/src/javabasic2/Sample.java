package javabasic2;

import javaBasic.StringLength;

public class Sample {

	public static void main(String[] args) 
	{
		int num=7;
		int cnt=0;
		
		for(int i=1;i<=100;i++)
		{
			primeFun(i);
		}
		
	}
	
	public static void primeFun(int num)
	{
		int cnt=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					cnt++;
				}
			}
			if(cnt==2) 
			{
				System.out.println(num + " - Prime Number");
			}
			else
			{
				System.out.println(num + " - Not Prime Number");
			}
		}
		else
		{
			System.out.println(num + " - Not Prime Number");
		}
	}

}
