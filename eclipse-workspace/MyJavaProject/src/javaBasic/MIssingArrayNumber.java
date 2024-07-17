package javaBasic;

public class MIssingArrayNumber 
{

	public static void main(String[] args) 
	{
		// given input
		int[] a = {1,2,3,4,5,6,8,10};
		
		// let's create another array with same length
	    // by default all index will contain zero
	    // default value for int variable
		
		int[] regis = new int[a.length];
		
		 // now let's iterate over given array to
	    // mark all present numbers in our register
	    // array
		
		for(int i=0; i<=a.length-1; i++)
		{
			regis[i]=i+1;
		}
				
		System.out.println("Missing Number is -> ");
		// now, let's print all the absentees
		for(int i=1; i<regis.length; i++)
		{
			if(a[i]-regis[i]==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}

