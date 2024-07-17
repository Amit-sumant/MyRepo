package com.java.General;

public class General_3 
{
	
	static int i=20;
	static int j=30;
	static int t;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Before swapping - " + i + " " + j);
		t=i;
		i=j;
		j=t;
				
		System.out.println("After swapping - " + i + " " + j);
				
		int a=10;
		int b=20;
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Before swapping - " + a + " " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping - " + a + " " + b);
		
		int k=10;
		int l=20;
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Before swapping - " + k + " " + l);
		
		k = k*l;  //k value 200
		l = k/l ; // 200/20 = 10
		k = k/l;  // 200/10 20
		
		
		System.out.println("After swapping - " + k + " " + l);
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("------------------Using Single Statement---------------------");
		
		int x=10; int y=20;
				
		y =	y+x -(x=y);
		
		System.out.println("After swapping - " + x + " " + y);

	}

}
