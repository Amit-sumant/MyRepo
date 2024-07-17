package javabasic2;

public class CntNumofODDEVENDigit {

	public static void main(String[] args) 
	{
		//below code for if number is 1234 then 2 even number and 2 odd number
		
		int num = 1235596;
		
		int even_cnt=0;
		int odd_cnt=0;
		
		while(num>0)
		{
			int rem = num%10;
			
			if(rem%2==0)
			{
				even_cnt++;
			}
			
			else
			{
				odd_cnt++;
			}
			
			num = num/10; // this will eliminate like 123 12 1 0
		}
		
		System.out.println("Your total count of EVEN number is -> " + even_cnt);
		System.out.println("Your total count of ODD number is -> " + odd_cnt);

	}

}
