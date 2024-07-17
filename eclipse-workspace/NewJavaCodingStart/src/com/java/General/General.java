package com.java.General;

public class General {

	public static void main(String[] args) 
	{
		/*
		 * int i=20;
		 * 
		 * do { System.out.println(i); i=i+1; }
		 * 
		 * while(i<=10);
		 */

		/*
		 * for(int i=1; i<=10; i++) { if(i==5) { //break; continue; }
		 * 
		 * System.out.println(i); }
		 */
	
		/*
		 * int i=1;
		 * 
		 * while(i<20) { if (i == 11) { i++; continue; }
		 * 
		 * System.out.println(i++); }
		 */
				
		int a[][] =new int[2][2];
		
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
		System.out.println("-----------------------Using Enhanced For Loop-----------------------------");
		
		//int a[][] = new { {100,200} , {300,400} };
		//here first row value 100 and 200 assign to r, then it go to inner loop and assign this value and print. Like this is working
		
		for(int r[]:a)
		{
			for(int k:r)
			{
				System.out.println(k);
			}
		}
		
				
				
	
	}

}
