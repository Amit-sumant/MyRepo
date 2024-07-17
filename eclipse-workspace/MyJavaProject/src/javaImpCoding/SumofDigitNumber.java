package javaImpCoding;

public class SumofDigitNumber {

	public static void main(String[] args) 
	{
		// if enter 1346 then it should calculate these number sum. The ans should be 14
		
		int num = 789654;
		int sum=0;
		
		while(num>0)
		{
			sum = sum+num%10;
			num = num/10;
		}
		
		System.out.println("sum - " + sum);

	}

}
