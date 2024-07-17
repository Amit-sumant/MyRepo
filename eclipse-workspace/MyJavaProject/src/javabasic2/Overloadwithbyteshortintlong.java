package javabasic2;

public class Overloadwithbyteshortintlong 
{
	
	/*public void print()
	{
		int num = 6666;
		int rev=0;
		
		int org_num = num;
	
		while(num>0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println(rev);
		
		if(rev==org_num)
		{
			System.out.println(org_num + " is a Palindrome");
		}
		else
		{
			System.out.println(org_num + " is not Palindrome");
		}
	}
	
	public void reverseNumArray()
	{
		Integer[] arr = {10,20,40,30,9,50,90};
		
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		System.out.println("Print in Rev order");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i] + " ");
		}
		
	}*/
	
	public void numofDigit()
	{
		int numdigit = 7897465;
		int cnt=0;
		
		while(numdigit>0)
		{
			numdigit = numdigit/10;
			cnt++;
		}
		System.out.println("Total num of digit - " + cnt);
	}
	
	public void numofEvenOddDigit()
	{
		int oddeven = 7845564;
		int odd_num = 0;
		int even_num = 0;
		int rem;
		
		while(oddeven>0)
		{
			rem = oddeven%10;
			
			if(oddeven%2==0)
			{
				even_num++;
			}
			else
			{
				odd_num++;
			}
			oddeven = oddeven/10;
		}
		
		System.out.println(even_num);
		System.out.println(odd_num);
	}
	
	public void sumofDigit()
	{
		int numof = 123456789;
		int sumnum = 0;
		
		while(numof>0)
		{
			sumnum = sumnum + numof % 10;
			numof = numof/10;
		}
		System.out.println(sumnum);
	}
	
	public void factorial()
	{
		long factnum = 7;
		int factsum = 0;
		
		for(int i=1;i<=factnum;i++)
		{
			System.out.println(i);
			
		}
	}
	

	public static void main(String[] args)
	{
		Overloadwithbyteshortintlong load = new Overloadwithbyteshortintlong();
		//load.print();
		//load.reverseNumArray();
		load.numofDigit();
		System.out.println(" ");
		load.numofEvenOddDigit();
		load.sumofDigit();
	}

}
