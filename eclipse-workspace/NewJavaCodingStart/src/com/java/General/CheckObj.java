package com.java.General;

public class CheckObj 
{
	
	static int val= 10;
	
	public CheckObj(int val) 
	{
		this.val=val;
	}
	
	public static void main(String[] args) 
	{
		CheckObj obj= new CheckObj(20);
		System.out.println(obj.val);
		
	}

}
