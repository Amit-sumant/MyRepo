package javaBasic;

public class FibonancySeries {

	public static void main(String[] args)
	{
		int n1 = 0; 
		int n2 = 1; 
		int n3; 
		int cnt=10;
		
		System.out.println(" Print - " + n1 + " " + n2); // to print 0 and 1
		
		for(int i=2; i<cnt; i++)
		{
			n3 = n1 + n2;
			System.out.println( " -> " + n3);
			n1=n2;
			n2=n3;
		}
		
		

	}

}
