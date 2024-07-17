package com.java.Basic_To_End;

public class Array_Demo {

	public static void main(String[] args) 
	{
		// single dimension array
		
		int a[] = new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		System.out.println(a.length);
		
		//we can also declare an arry as below
		
		int b[] = {1,2,3,4,5,6,7};
		
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("*****************Multi Diementional Array**********************");
		
		int aa[][] = new int[2][2];
		
		aa[0][0] = 100;
		aa[0][1] = 300;
		
		aa[1][0] = 200;
		aa[1][1] = 400;
		
		System.out.println("Number of Rows -> " + aa.length);
		System.out.println("Number of Columns -> " + aa[0].length);
		
		for(int j=0; j<aa.length; j++) // this is for rows
		{
			for(int k=0; k<aa[j].length; k++) // this for column
			{
				System.out.println("For Loop Result -> " + aa[j][k]);
			}
		}
		
		//Using Enhamced for loop
		
		System.out.println("---------------------Enhanced For Loop-----------------------------");
		
		for(int row[] : aa) //row represent single dimention array. row contains first row
		{
			for(int z : row) // and this row value stotred in z varibale and print
			{
				System.out.println(z);
			}
		}

	}

}
