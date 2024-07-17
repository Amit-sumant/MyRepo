package javaImpCoding;

public class MIssingNumberinArray {

	public static void main(String[] args) 
	{
		// MIssing number in Array
		
		int a[]= {1,2,3,4,6};
		int b[]= {1,2,3,6,4,5};
		int sum=0; int sum1=0;
		
		for(int i=0;i<a.length; i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum of array -> " + sum);
		
		for(int j=0;j<b.length; j++)
		{
			sum1=sum1+b[j];
		}
		
		System.out.println("Sum of array -> " + sum1);
		
		System.out.println("Missing Number" + (sum - sum1));

	}

}
